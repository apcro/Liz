# Liz
[![](https://jitpack.io/v/apcro/Liz.svg)](https://jitpack.io/#apcro/Liz)

Add support to themes in your app.

Usage example [LeafPic](https://github.com/apcro/LeafPic)

## Setup:

### Gradle Dependency:

This version of *Liz* is available on [**jitpack.io**](https://jitpack.io/#apcro/Liz).

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add this in your module `build.gradle` file:
```gradle

dependencies {
    implementation 'com.github.apcro:Liz:0.6.0'
}
```