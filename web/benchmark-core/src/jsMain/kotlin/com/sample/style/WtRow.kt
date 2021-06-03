package com.sample.style

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.*
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.*

object WtRows : StyleSheet(AppStylesheet) {
    
    val wtRow by style {
        AppCSSVariables.wtHorizontalLayoutGutter(0.px)
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Wrap)

        property(
            "margin-right",
            value("calc(-1*${AppCSSVariables.wtHorizontalLayoutGutter.value()})")
        )
        property(
            "margin-left",
            value("calc(-1*${AppCSSVariables.wtHorizontalLayoutGutter.value()})")
        )
        property("box-sizing", "border-box".asStylePropertyValue())
    }
    
    val wtRowSizeM by style {
        AppCSSVariables.wtHorizontalLayoutGutter(16.px)

        media(maxWidth(640.px)) {
            self style {
                AppCSSVariables.wtHorizontalLayoutGutter(8.px)
            }
        }
    }

    val wtRowSizeXs by style {
        AppCSSVariables.wtHorizontalLayoutGutter(6.px)
    }
    
    val wtRowSmAlignItemsCenter by style {
        self style {
            alignItems(AlignItems.Center)
        }
    }
}