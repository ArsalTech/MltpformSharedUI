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
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mltpformsharedui.composeapp.generated.resources.Res
import mltpformsharedui.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(batteryLevelManager: BatteryLevelManager) {
   MaterialTheme {
      Box(
         modifier = Modifier.fillMaxWidth(),
         contentAlignment = Alignment.Center
      ) {
         Text("The Current Battery Level is ${batteryLevelManager.getBatteryLevel()}")
      }
   }
}