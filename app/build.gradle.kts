plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
//    id("kotlin-kapt")

    //ksp
    id("com.google.devtools.ksp")

    //+hilt
    //    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.tamerlan.dependencyinjectionstart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tamerlan.dependencyinjectionstart"
        minSdk = 24
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
    kotlinOptions {
        jvmTarget = "1.8"
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


//    implementation("com.google.dagger:dagger:2.52")
//    ksp("com.google.dagger:dagger-android-processor:2.52")
//    ksp("com.google.dagger:dagger-compiler:2.52")

    implementation(libs.dagger)
    ksp(libs.dagger.compiler)
    ksp(libs.dagger.android.processor)


//    kapt(libs.dagger.compiler.v2283)


//Dagger - Hilt
//    implementation("com.google.dagger:hilt-android:2.48")
//    ksp("com.google.dagger:hilt-compiler:2.48")


}