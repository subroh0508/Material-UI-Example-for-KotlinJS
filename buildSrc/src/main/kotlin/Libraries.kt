@file:Suppress("HardcodedStringLiteral")

object Libraries {
    class JsWrappers(kotlinVersion: String) {
        private val wrappersBuild = "pre.210-kotlin-$kotlinVersion"

        private val reactVersion = "${Npm.react}-$wrappersBuild"
        val react = "org.jetbrains.kotlin-wrappers:kotlin-react:$reactVersion"
        val reactDom = "org.jetbrains.kotlin-wrappers:kotlin-react-dom:$reactVersion"

        private val htmlVersion = "0.7.3"
        val html = "org.jetbrains.kotlinx:kotlinx-html-js:$htmlVersion"

        private val cssVersion = "1.0.0-$wrappersBuild"
        val css = "org.jetbrains.kotlin-wrappers:kotlin-css-js:$cssVersion"

        private val styledVersion = "${Npm.styledComponent}-$wrappersBuild"
        val styled = "org.jetbrains.kotlin-wrappers:kotlin-styled:$styledVersion"

        private val extensionsVersion = "1.0.1-$wrappersBuild"
        val extensions = "org.jetbrains.kotlin-wrappers:kotlin-extensions:$extensionsVersion"

        private val reactRouterDomVersion = "${Npm.reactRouterDom}-$wrappersBuild"
        val reactRouterDom = "org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:$reactRouterDomVersion"
    }

    object Npm {
        const val styledComponent = "5.3.0"
        const val inlineStyledPrefixer = "^5.1.2"
        const val react = "17.0.2"
        const val reactRouterDom = "5.2.0"

        object MaterialUi {
            // v4.11.4 does not work because index.js is not included in the npm module for some reason
            const val core = "4.11.3"
            const val lab = "4.0.0-alpha.57"
        }
    }
}
