@file:JsModule("@material-ui/core")

package materialui

import materialui.components.button.ButtonProps
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.TouchRippleProps
import react.RClass

internal external val Button: RClass<ButtonProps>
internal external val ButtonBase: RClass<ButtonBaseProps>
internal external val TouchRipple: RClass<TouchRippleProps>
