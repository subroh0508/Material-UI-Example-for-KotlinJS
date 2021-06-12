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
    implementation(kotlinReflect)

    val wrappers = Libraries.JsWrappers(kotlinVersion)
    implementation(wrappers.react)
    implementation(wrappers.reactDom)
    implementation(wrappers.styled)
    implementation(wrappers.reactRouterDom)
    implementation(npm("@material-ui/core", Libraries.Npm.MaterialUi.core))

    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        useCommonJs()
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}
