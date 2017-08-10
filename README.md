# Android-Debug-Logger
Android library for logging only in debug mode.

[![Release](https://jitpack.io/v/User/Repo.svg)]
(https://jitpack.io/#ashwindmk/Android-Debug-Logger)

DebugLogger library allows you to log only in debug mode. This is important because you don't want to log in your release build. So you don't need to remove all the logs before building your release apk.

### Setup

Add the jitpack.io repository in your project-level build.gradle file:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the following dependency in your app/build.gradle file:
```gradle
compile 'com.github.ashwindmk:Android-Debug-Logger:1.0'
```

In your application file:
```java
public class AppController extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Should log only in debug build variant
        DebugLogger.sSHOULD_LOG = BuildConfig.DEBUG;
    }
}
```

In your AndroidManifest.xml file:
```xml
<application
        ...
        android:name=".AppController">
   ...
</application>
```

### Usage

In your activity or fragment:
```java
// Default tag
DebugLogger.d("YOUR LOG MESSAGE STRING");

// Custom tag
DebugLogger.d("YOUR CUSTOM TAG", "YOUR LOG MESSAGE STRING");
```

You can see the logs in your Android Monitor in Android Studio only in debug mode. You will not see the logs in release mode.
