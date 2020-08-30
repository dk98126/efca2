group "com.github.dk98126"
version "0.0.1-SNAPSHOT"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    jcenter()
}

dependencies {
//    Kotlin js stdlib
    implementation(kotlin("stdlib-js"))

//    React, React DOM + Wrappers
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.110-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.110-kotlin-1.4.0")
    implementation(npm("react", "16.13.1"))
    implementation(npm("react-dom", "16.13.1"))

//    Kotlin Styled
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.110-kotlin-1.4.0")
    implementation(npm("styled-components", "~5.1.1"))
    implementation(npm("inline-style-prefixer", "~6.0.0"))

//    Video Player
    implementation(npm("react-player", "~2.6.0"))

//    Share Buttons
    implementation(npm("react-share", "~4.2.1"))

//    Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}
