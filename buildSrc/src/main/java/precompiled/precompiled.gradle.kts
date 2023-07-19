import dependencies.AndroidEnvironmentValue
import dependencies.Dependency
import dependencies.TestDependency
import org.gradle.kotlin.dsl.dependencies


plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = AndroidEnvironmentValue.COMPILE_SDK

    defaultConfig {
        minSdk = AndroidEnvironmentValue.MIN_SDK
        targetSdk = AndroidEnvironmentValue.TARGET_SDK
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    kotlinOptions {
        jvmTarget = "11"
    }
    hilt {
        enableExperimentalClasspathAggregation = true
    }
}

dependencies {

    implementation(Dependency.KTX.CORE)
    implementation(Dependency.KTX.ACTIVITY)
    implementation(Dependency.KTX.FRAGMENT)
    implementation(Dependency.KTX.LIFECYCLE_RUNTIME_KTX)
    implementation(Dependency.KTX.LIFECYCLE_EXTENSIONS)
    implementation(Dependency.KTX.LIFECYCLE_VIEW_MODEL)
    implementation(Dependency.KTX.NAVIGATION_FRAGMENT)
    implementation(Dependency.KTX.NAVIGATION_RUNTIME)
    implementation(Dependency.KTX.NAVIGATION_UI)

    implementation(Dependency.AndroidX.PAGING3)
    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Dependency.AndroidX.PAGING3)
    implementation(Dependency.AndroidX.SWIPE_REFRESH)

    implementation(Dependency.Google.GSON)

    implementation(Dependency.Kotlin.REFLECTION)
    implementation(Dependency.Kotlin.SDK)
    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)

    implementation(Dependency.Google.MATERIAL3)

    kapt(Dependency.Hilt.APT)
    implementation(Dependency.Hilt.CORE)

    testImplementation(TestDependency.JUNIT)
    testImplementation(TestDependency.Kotlin.TEST)
    testImplementation(TestDependency.Kotlin.JUNIT_TEST)
    testImplementation(TestDependency.Kotlin.COROUTINE_TEST)
    testImplementation(TestDependency.AndroidX.TEST_CORE)
    testImplementation(TestDependency.MockK.CORE)
}
