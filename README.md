## Prerequisites

Before you begin, ensure you have the following tools installed on your local machine:

## Android Studio (latest stable version)
Download Android Studio
Java Development Kit (JDK)
JDK 8 or higher is recommended.
Download JDK
Android SDK
Android Studio will manage the SDK installation for you. You can manage SDKs through the SDK Manager in Android Studio.
Git
Download Git
Gradle
Gradle is automatically managed by Android Studio, so you don’t need to install it separately.
## Installation & Setup

Clone the Repository
First, clone the repository to your local machine:

## git clone https://github.com/webexpertesfera/Android_Sample.git
``` 
cd your-project-name
Open the Project in Android Studio
Launch Android Studio.
Select Open an existing project from the Android Studio welcome screen.
Navigate to the project folder and select it.
Android Studio will automatically sync the project and download the required dependencies. This may take a few minutes.
Install Dependencies
If the dependencies are not installed automatically, you can manually sync them by running:

bash ./gradlew build
This will download all the necessary dependencies.

Running the Project

Option 1: Run on Emulator
Open AVD Manager in Android Studio (Tools > AVD Manager).
Create a new Android Virtual Device (AVD) or use an existing one.
Click the Run button (or press Shift + F10) in Android Studio.
Select the target device (either the emulator or a connected physical device).
Option 2: Run on a Physical Device
Connect your Android device via USB.
Enable Developer Options and USB Debugging on your Android device:
Go to Settings > About phone and tap Build number 7 times.
In Settings > Developer options, enable USB Debugging.
Select the device from the device selector in Android Studio.
Click the Run button to deploy the app to your physical device.


Project Structure

Here’s an overview of the project directory structure:

```
## MyAndroidApp
```
├── app/                        # Main application module
│   ├── src/                    # Source code
│   │   ├── main/               # Main application code
│   │   │   ├── java/           # Java/Kotlin source code
│   │   │   └── res/            # Resources (layouts, strings, etc.)
│   │   └── test/               # Unit tests
│   ├── build.gradle            # App-level build file
│   └── AndroidManifest.xml     # Manifest file
│
├── gradle/                     # Gradle wrapper files
├── build.gradle                # Project-level build file
├── settings.gradle             # Settings for project modules
└── README.md                   # This file
```
