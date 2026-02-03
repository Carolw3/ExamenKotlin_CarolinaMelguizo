val org.gradle.api.provider.Provider<org.gradle.api.artifacts.MinimalExternalModuleDependency>.v132: kotlin.Any

val org.gradle.api.provider.Provider<org.gradle.api.artifacts.MinimalExternalModuleDependency>.v214: kotlin.Any

val org.gradle.api.provider.Provider<org.gradle.api.artifacts.MinimalExternalModuleDependency>.v1110: kotlin.Any

val org.gradle.api.provider.Provider<org.gradle.api.artifacts.MinimalExternalModuleDependency>.v161: kotlin.Any

val org.gradle.api.provider.Provider<org.gradle.api.artifacts.MinimalExternalModuleDependency>.v1120: kotlin.Any

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.jorlina.examenkotlin"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.jorlina.examenkotlin"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1110)
    implementation(libs.androidx.constraintlayout.v214)
    implementation(libs.androidx.recyclerview.v132)
}