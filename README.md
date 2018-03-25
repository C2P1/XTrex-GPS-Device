# XTrex-GPS-Device

XTrex is an on-screen simulation of a hand-held GPS device, with the ability to speak turn by turn directions in a language of the users choosing.   

This was built by a team of 5 in which we followed a scrum development approach with a Product Owner, Scrum Master, and three developers. My primary role as developer was to implement the speech abilities of the device and provide an API for Speech and Languages for the rest of the device components to access. 

## Detailed Specifications
The XTrex is a hand-held device measuring 54mm × 103mm × 33mm. On the front, it has an LCD display; on the left it has +/- and Select buttons; on the right it has a Menu button; and at the top it has an On/Off Button. 

## Using The Device

The default screen of the device is the main menu which shows the different features of the device. 

<p align="center">
<img src="https://github.com/C2P1/XTrex-GPS-Device/blob/master/src/main/resources/img/MainMenu.png" width="240">
</p>

Selecting the Where To screen prompts the user to enter a destination. This destination is sent to Google Maps API where the map and directions are downloaded from. 

Opening the Map screen  then displays the users location with the current directions step and the distance to the next turn. On the top left features status symbols for GPS connectivity, speach availability, and gps availability, respectively. 

<p align="center">
<img src="https://github.com/C2P1/XTrex-GPS-Device/blob/master/src/main/resources/img/MapMode.png" width="240">
</p>

Returning to the main menu and entering the Speech menu allows the user to select a language for the device to speak the turn by turn directions. 
This is done by sending the directions downloaded by the Google Maps API to the Microsoft Cognitive Services (Bing Speech) API and downloading the audio files to save locally. The directions are spoken when the user is 10m from the next turn. 

<p align="center">
<img src="https://github.com/C2P1/XTrex-GPS-Device/blob/master/src/main/resources/img/LanguageMenu.png" width="240">
</p>

On top of this, the device will display notifications via a small popup window at the top of the screen. In conjunction with this, if speech is enabled, the device will verbally say the notification out loud in the language the device is currently set to. The notifications are used to tell the user about such events as GPS connectivity (GPS lost, or GPS back online), internet connectivity, maps availability, and more. 

The other menus display helpful information to the user such as the current latitude and longitude, distance travelled, and the current travelling speed. This screen is for satellite information. 

<p align="center">
<img src="https://github.com/C2P1/XTrex-GPS-Device/blob/master/src/main/resources/img/Satellite.png" width="240">
</p>

## Building the Program

<code> 
git clone https://github.com/C2P1/XTrex-GPS-Device.git

cd XTrex-GPS-Device
</code>

Add the jar files to the class path:  

mac:   

<code>
export CLASSPATH=json-simple-1.1.jar:RXTXcomm.jar:.:./*
</code>

windows:  

<code>
set CLASSPATH=RXTXcomm.jar;json-simple1.1.jar;.;./*
</code>

## Running the Program 



