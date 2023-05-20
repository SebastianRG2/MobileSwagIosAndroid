# **Automation Mobile SwagLabs**

## Introduction 🚀

Automation project made for SwagLabs.

## Consider 🕵️

Remember that the class "MobileDriver" contains the capabilities to work locally

``` 
- Local
    #Local capabilities
    #appium.hub = http://127.0.0.1:4723/wd/hub/
    #appium.app =
    #appium.deviceName = emulator-5554
    #appium.platformVersion = 13
```

## Scenarios 🐛

- Login feature
- Shopping cart feature

## Pre requirements to execute 🎬

- Java version 1.8, update 151 or higher and JDK (environment variables configured).
- Gradle version 8.0 or higher (environment variables configured).
- Cucumber for Java Plugin (updated version).
- Gherkin Plugin (updated version).
- Appium server o appium desktop Version 1.19.1 or higher
- Ios simulator
- Android device

## Project Structure 🚧

* ```src/main/java/co/com/accenture/automation```

``` 
+ exceptions
Classes where exceptions are implemented to specify which scenario failed.

+ interactions
Functions that are not specific to serenity that help to interact with the device on mobile.

+ questions
Classes used to make the assertion and confirm that the feature has been executed correctly.

+ tasks
Classes where several functions are implemented to perform a specific functionality.

+ user interface
Classes where the xpath of each screen are.

+ useful
Classes that implement programming logic without any serenity function.

```

* ```src/test/java/co/com/accenture/automation```

```
+ runners
Classes to run the automation with the scenarios indicated in the feature.

+ step definitions
Classes that describe the steps of each feature.
 ```

* ```src/test/resources/```

```
+ features
Here are the features corresponding to the project.
```

## Built with 🏗️

Automation was developed with:

- BDD → Development strategy
- Screenplay
- Gradle → Dependency manager
- Appium V2 → Tool to automate actions in mobile devices
- Cucumber → Framework to automate BDD tests
- Serenity BDD → Open source library for report generation
- Gherkin → Business Readable DSL Language (Business-readable domain specific language)
- Xcode -> For ios Simulator

## Versioning🛡️

Git was used for version control