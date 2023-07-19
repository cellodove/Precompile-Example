package dependencies

object TestDependency {

    const val JUNIT = "junit:junit:4.13.2"

    object Kotlin {
        const val TEST = "org.jetbrains.kotlin:kotlin-test:${Versions.KOTLIN_TEST}"
        const val JUNIT_TEST = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.KOTLIN_TEST}"
        const val COROUTINE_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINE}"
    }

    object MockK {
        const val CORE = "io.mockk:mockk:${Versions.MOCK_K}"
    }

    object AndroidX {
        const val TEST_CORE = "androidx.test:core:${Versions.ANDROIDX_TEST}"
    }
}