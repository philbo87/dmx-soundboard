dmx-soundboard
==============

My first Android App - the DMX Soundboard!

Development Log:

Bugs:
-Sometimes sounds won't play. The time I saw it happen I opened the app, pressed a sound, and then they stopped. Sometimes it happens immediately after the app opens. Not sure what the deal is...
-Need to clean up things/kill activities when closing (I think)


31-Dec-2012 12:37 PM
------------
Now forcing into portrait mode
Fixed issue where a launcher icon was appearing for each activity

31-Dec-2012 11:19 AM
-------------
Made the UI for the Soundboard much nicer

31-Dec-2012 10:27 AM
-------------
Fixed the bug that was causing all sounds to stop and buttons not to function when a button is pressed multiple times in a row. Now a sound won't attempt to play if the MediaPlayer is currently playing

31-Dec-2012 2:06 AM
-------------
Made the basic app. Plays the sounds, has a horrible UI. For some reason, two activities get created when I install the APK to my Galaxy S3. Need to figure that out. App also chokes on pressing the sound button many times in a row - need to prevent that. A UI upgrade would be nice...
