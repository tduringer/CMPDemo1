package com.trintduringer.cmp_demo1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMPDemo1",
    ) {
        App()
    }
}