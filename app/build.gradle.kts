plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.javafinal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.javafinal"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("com.google.firebase:firebase-firestore") // Firebase Firestore sürümünü güncelledim
    implementation("com.google.firebase:firebase-storage") // Firebase Storage sürümünü güncelledim
    implementation("com.github.bumptech.glide:glide:4.12.0") // Glide sürümünü güncelledim
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation (platform("com.google.firebase:firebase-bom:28.4.0"))

    implementation("androidx.appcompat:appcompat:1.4.1") // AppCompat sürümünü güncelledim
    implementation("com.google.android.material:material:1.5.0") // Material sürümünü güncelledim
    implementation("androidx.constraintlayout:constraintlayout:2.1.0") // ConstraintLayout sürümünü güncelledim
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0") // Lifecycle sürümünü güncelledim
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    implementation("androidx.navigation:navigation-fragment:2.3.5") // Navigation sürümünü güncelledim
    implementation("androidx.navigation:navigation-ui:2.3.5")
    implementation("com.google.firebase:firebase-auth") // Firebase Auth sürümünü güncelledim
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

