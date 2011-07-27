/**
 * 
 */
package raftejo.android.rest;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

/**
 * @author John
 *
 */
public class CallWebServiceTask extends AsyncTask<Object, Object, String> 
{
	private ProgressDialog dialog;
	protected Context applicationContext;

	@Override
	protected void onPreExecute() {
		this.dialog = ProgressDialog.show(applicationContext, "Calling", "Time Service...", true);
	}

	@Override
	protected String doInBackground(Object... params) {

		return WebServiceActivity.getTimeStampFromYahooService();
	}

	@Override
	protected void onPostExecute(String result) {
		this.dialog.cancel();
		String timestamp = WebServiceActivity.parseJSONResponse(result);
		timestamp = WebServiceActivity.UnixTimeStampToDateTime(timestamp);
		WebServiceActivity.getTxtTime().setText(timestamp);
	}
}