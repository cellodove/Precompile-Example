package dependencies

object Dependency {

    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"
        const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
        const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
        const val REFLECTION = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.KTX_CORE}"
        const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
        const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
        const val ACTIVITY = "androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY}"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.ANDROIDX_FRAGMENT}"
        const val NAVIGATION_RUNTIME = "androidx.navigation:navigation-runtime-ktx:${Versions.ANDROIDX_NAVIGATION}"
        const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.ANDROIDX_NAVIGATION}"
        const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.ANDROIDX_NAVIGATION}"
    }

    object Hilt {
        const val CORE = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val APT = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    }

    object Google {
        const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
        const val MATERIAL3 = "com.google.android.material:material:${Versions.MATERIAL3}"
    }

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.2"
        const val PAGING3 = "androidx.paging:paging-runtime:3.1.0"
        const val SWIPE_REFRESH = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
    }

    object DataBinding {
        const val DATA_BINDING = "com.android.databinding:compiler:3.5.3"
    }

    object Network {
        const val OKHTTP3 = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP3}"
        const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING}"
        const val RETROFIT2 = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT2}"
        const val RETROFIT_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT2}"
        const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT2}"
    }

    object ETC {
        const val GLIDE = "com.github.bumptech.glide:glide:4.15.1"
    }

}