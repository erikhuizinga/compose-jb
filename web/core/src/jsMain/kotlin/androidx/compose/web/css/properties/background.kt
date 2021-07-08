/*
 * Copyright 2020-2021 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

package org.jetbrains.compose.web.css

fun StyleBuilder.backgroundColor(value: String) {
    property("background-color", value)
}

fun StyleBuilder.backgroundColor(value: CSSColorValue) {
    property("background-color", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment
fun StyleBuilder.backgroundAttachment(value: String) {
    property("background-attachment", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/background-image
fun StyleBuilder.backgroundImage(value: String) {
    property("background-image", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/background-position
fun StyleBuilder.backgroundPosition(value: String) {
    property("background-position", value)
}

// https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat
fun StyleBuilder.backgroundRepeat(value: String) {
    property("background-repeat", value)
}