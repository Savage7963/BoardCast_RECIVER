# BoardCast_RECIVER
 Broadcast in android is the system-wide events that can occur when the device starts, when a message is received on the device or when incoming calls are received, or when a device goes to airplane mode, etc.
 Broadcast Receivers are used to respond to these system-wide events. Broadcast Receivers allow us to register for the system and application events, and when that event happens, then the register receivers get notified. There are mainly two types of Broadcast Receivers:

* Static Broadcast Receivers: These types of Receivers are declared in the manifest file and works even if the app is closed.
  
* Dynamic Broadcast Receivers: These types of receivers work only if the app is active or minimized.

 Since from API Level 26, most of the broadcast can only be caught by the dynamic receiver, so we have implemented dynamic receivers in our sample project given below. There are some static fields defined in the Intent class which can be used to broadcast different events. We have taken a change of airplane mode as a broadcast event, but there are many events for which broadcast register can be used. Following are some of the important system-wide generated intents:-

                       Intent

### Description Of Event

* android.intent.action.BATTERY_LOW :	Indicates low battery condition on the device.
* android.intent.action.BOOT_COMPLETED :	This is broadcast once after the system has finished booting
* android.intent.action.CALL :	 To perform a call to someone specified by the data
* android.intent.action.DATE_CHANGED :	Indicates that the date has changed
* android.intent.action.REBOOT :	Indicates that the device has been a reboot
* android.net.conn.CONNECTIVITY_CHANGE	: The mobile network or wifi connection is changed(or reset)
* android.intent.ACTION_AIRPLANE_MODE_CHANGED : 	This indicates that airplane mode has been switched on or off.

