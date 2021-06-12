plugins {
    kotlin("js")
}

group = "me.subroh_0508"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") }
}

dependencies {
    val wrappers = Libraries.JsWrappers(kotlinVersion)

    implementation(wrappers.react)
    implementation(wrappers.reactDom)
    implementation(wrappers.styled)
    implementation(wrappers.reactRouterDom)

    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}