@file:Suppress("HardcodedStringLiteral")

import org.gradle.api.Project

val Project.kotlinVersion get() = version("kotlin")
val Project.kotlinGradlePlugin get() = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

val Project.kotlinReflect get() = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
