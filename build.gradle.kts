plugins {
    kotlin("js") version "1.5.10"
}

group = "me.subroh_0508"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers") }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains:kotlin-react:17.0.1-pre.148-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-react-dom:17.0.1-pre.148-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-styled:5.2.1-pre.148-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-react-router-dom:5.2.0-pre.148-kotlin-1.4.30")
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