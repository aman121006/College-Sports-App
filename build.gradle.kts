plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("org.jetbrains.kotlin.android")
    id("com.google.firebase.crashlytics")

}

android {
    namespace = "com.titdevelopercommunity.titsports"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.titdevelopercommunity.titsports"
        minSdk = 26
        targetSdk = 34
        versionCode = 3
        versionName = "3.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        viewBinding = true
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("com.google.firebase:firebase-database-ktx:20.3.1")
    implementation("com.google.firebase:firebase-storage-ktx:20.3.0")

    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.firebaseui:firebase-ui-database:8.0.2")
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("com.airbnb.android:lottie:6.2.0")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-crashlytics:18.6.3")
    implementation("com.google.firebase:firebase-analytics:21.6.1")
    implementation("com.google.firebase:firebase-database:20.3.1")


    annotationProcessor ("com.github.bumptech.glide:compiler:4.14.2")

    implementation ("com.google.android.play:app-update:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.activity:activity-ktx:1.8.2")



}