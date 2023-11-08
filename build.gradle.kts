// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies{
        classpath ("com.android.tools.build:gradle:8.1.2") // Use the latest version
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // Use the latest version
        classpath ("com.google.gms:google-services:4.3.10")
        classpath ("com.android.tools.build:gradle")
        classpath ("com.google.gms:google-services")// Use the latest version

    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
}


