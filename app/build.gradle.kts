plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.app.palmdetectionapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.app.palmdetectionapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled =true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // CameraX
    implementation ("androidx.camera:camera-camera2:1.0.0-beta07")
    implementation ("androidx.camera:camera-lifecycle:1.0.0-beta07")
    implementation ("androidx.camera:camera-view:1.0.0-alpha14")

    // Import the base SDK.
    implementation ("com.huawei.hms:ml-computer-vision-handkeypoint:2.0.2.300")
    // Import the hand keypoint detection model package.
    implementation ("com.huawei.hms:ml-computer-vision-handkeypoint-model:2.0.2.300")

    implementation ("androidx.multidex:multidex:2.0.1")

    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.2.0")
}