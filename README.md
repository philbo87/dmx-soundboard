***RIP DMX 4/9/2021***

dmx-soundboard
==============

My first Android App - the DMX Soundboard!

Development Log:

ToDo:
-Finish implementing exit app button
-Text on Splash Screen?

10-Jan-2013 10:41 PM
-----------
-Added four more sounds - DMX crying, DMX saying "Mommy", DMX talking about his kids/career, and DMX singing Rudolph the Red Nosed Reindeer. I am considering sounds done for now.
-I have also begun implmenting a menu with an exit button. But, something isn't being done right. The app "crashes" when I exit. Maybe I need to make an intent to exit? Not sure yet, and I'm too tired to figure it out right now.

2-Jan-2013 9:02 PM
-----------
Now finishing the activity no matter what when it is paused. Also I changed the way the media player works - if you press a button for a sound while a sound is playing, the playing sound will stop now and the new sound will start playing. Multiple sounds do not play at once. This seems to have solved the issue where none of the buttons work suddenly.

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
