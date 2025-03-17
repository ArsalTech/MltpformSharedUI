package com.devgate.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mltpformsharedui.composeapp.generated.resources.Res
import mltpformsharedui.composeapp.generated.resources.compose_multiplatform
import mltpformsharedui.composeapp.generated.resources.logo

@Composable
@Preview
fun App(batteryLevelManager: BatteryLevelManager) {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Image(
                    painterResource(Res.drawable.logo),
                    contentDescription = null
                )
                Text("The Current Battery Level is ${batteryLevelManager.getBatteryLevel()}")

            }
        }
    }
}