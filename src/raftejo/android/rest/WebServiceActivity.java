package raftejo.android.rest;

import org.json.JSONException;
import org.json.JSONObject;

import raftejo.android.app.R;
import raftejo.android.rest.RestClient.RequestMethod;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WebServiceActivity extends Activity {
	private static TextView txtTime;
	
	public static TextView getTxtTime() {
		return txtTime;
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
        setContentView(R.layout.rest);
        
     // keep the handle to the textview for later
		txtTime = (TextView) findViewById(R.id.txtTime);

		// add a click event handler for the button
		final Button btnCallWebService = (Button) findViewById(R.id.btnCallWebService);
		btnCallWebService.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				CallWebServiceTask task = new CallWebServiceTask();
				task.applicationContext = WebServiceActivity.this;
				task.execute();
			}
		});        
	}

	public static String UnixTimeStampToDateTime(String unixTimeStamp) {

		long tiemstamp = Long.parseLong(unixTimeStamp);
		String dateStr = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date (tiemstamp*1000));

		return dateStr;
	}

	public static String parseJSONResponse(String jsonResponse) {
		String timestamp = "";

		JSONObject json;
		try {
			json = new JSONObject(jsonResponse);
			JSONObject result = json.getJSONObject("Result");
			timestamp = result.getString("Timestamp");

		} catch (JSONException e) {

			e.printStackTrace();
		}

		return timestamp;
	}

	public static String getTimeStampFromYahooService() {

		String responseString = null;

		String baseurlString = "http://developer.yahooapis.com/TimeService/V1/getTime";

		RestClient client = new RestClient(baseurlString);
		client.AddParam("appid", "YahooDemo");
		client.AddParam("output", "json");

		try {
			client.Execute(RequestMethod.GET);
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseString = client.getResponse();

		return responseString;
	}
}
