[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)
# iLikeYouBot
A Java bot that likes Instagram photos. Final project for AP Computer Science A.

Created by Ming, Megan, Keila, and Tyler.

## Demo
[https://youtu.be/AA8sDmARw0M](https://youtu.be/AA8sDmARw0M)

## Usage

### Requirements

This project only supports Windows and Mac OS. Download the correct [ChromeDriver](https://chromedriver.chromium.org/) and move it into the main directory. The repository already contains the Chrome version 83 ChromeDrivers for Windows and Mac.

1. Clone or [download](https://github.com/evilpegasus/iLikeYouBot/archive/master.zip) this repository
2. Place the correct ChromeDriver file in the main directory with [Bot.java](Bot.java). The file should be named [chromedriver.exe](chromedriver.exe) for Windows or just [chromedriver](chromedriver) for Mac. Make chromedriver executable on Mac with
```
% chmod 755 YourScriptName.sh
```
3. Add all jar files in the [selenium-java-3.141.59](selenium-java-3.141.59) file as Java dependencies

### Instructions
1. Run the main method in [bot.java](bot.java)
2. Input your Instagram username and password when prompted in the terminal
3. Watch the bot like photos automatically. It will stop after a while.
4. Press Ctrl + C to terminate the program if needed
