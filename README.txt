27-07-11
- Testing EGit synchronize with incoming changes

27-02-11

- Testing a Git commit!

- Dell 610 Laptop

	- App takes nearly 2mins to start if Android-2.1-HVGA emulator is not already running
	- Sometimes
		- Alarm Clock app force closes
		- Hello World app nearly force closes waiting for debugger to attach
	- You can rerun the app without having the stop the emulator
		- takes 45 secs that way: 
			[2011-02-27 23:16:27 - Sandbox] Installing Sandbox.apk...
			[2011-02-27 23:17:11 - Sandbox] Success!
			[2011-02-27 23:17:11 - Sandbox] Starting activity raftejo.android.app.HelloWorldActivity on device emulator-5554	
			[2011-02-27 23:17:22 - Sandbox] Attempting to connect debugger to 'raftejo.android.app' on port 8604
	 
 
LOGs:

[2011-02-27 22:52:14 - Sandbox] ------------------------------
[2011-02-27 22:52:14 - Sandbox] Android Launch!
[2011-02-27 22:52:14 - Sandbox] adb is running normally.
[2011-02-27 22:52:14 - Sandbox] Performing raftejo.android.app.HelloWorldActivity activity launch
[2011-02-27 22:52:14 - Sandbox] Failed to find an AVD compatible with target 'Android 2.1-update1'.
[2011-02-27 22:53:52 - SDK Manager] Created AVD 'Android-2.1-HVGA' based on Android 2.1-update1,
[2011-02-27 22:53:52 - SDK Manager] with the following hardware config:
[2011-02-27 22:53:52 - SDK Manager] hw.lcd.density=160
[2011-02-27 22:54:17 - Sandbox] Still no compatible AVDs with target 'Android 2.1-update1': Aborting launch.
[2011-02-27 22:54:17 - Sandbox] Performing raftejo.android.app.HelloWorldActivity activity launch
[2011-02-27 22:54:26 - Sandbox] Launch canceled!
[2011-02-27 22:54:30 - Sandbox] ------------------------------
[2011-02-27 22:54:30 - Sandbox] Android Launch!
[2011-02-27 22:54:30 - Sandbox] adb is running normally.
[2011-02-27 22:54:30 - Sandbox] Performing raftejo.android.app.HelloWorldActivity activity launch
[2011-02-27 22:54:30 - Sandbox] Automatic Target Mode: launching new emulator with compatible AVD 'Android-2.1-HVGA'
[2011-02-27 22:54:30 - Sandbox] Launching a new emulator with Virtual Device 'Android-2.1-HVGA'
[2011-02-27 22:54:35 - Sandbox] New emulator found: emulator-5554
[2011-02-27 22:54:35 - Sandbox] Waiting for HOME ('android.process.acore') to be launched...
[2011-02-27 22:56:55 - Sandbox] WARNING: Application does not specify an API level requirement!
[2011-02-27 22:56:55 - Sandbox] Device API version is 7 (Android 2.1-update1)
[2011-02-27 22:56:55 - Sandbox] HOME is up on device 'emulator-5554'
[2011-02-27 22:56:55 - Sandbox] Uploading Sandbox.apk onto device 'emulator-5554'
[2011-02-27 22:56:55 - Sandbox] Installing Sandbox.apk...
[2011-02-27 22:57:15 - Sandbox] Success!
[2011-02-27 22:57:15 - Sandbox] Starting activity raftejo.android.app.HelloWorldActivity on device emulator-5554
[2011-02-27 22:57:30 - Sandbox] Attempting to connect debugger to 'raftejo.android.app' on port 8604
