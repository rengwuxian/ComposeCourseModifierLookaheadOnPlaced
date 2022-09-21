package com.example.composecoursemodifierlookaheadonplaced

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LookaheadLayout
import androidx.compose.ui.layout.OnPlacedModifier
import androidx.compose.ui.layout.OnRemeasuredModifier
import androidx.compose.ui.layout.onPlaced
import com.example.composecoursemodifierlookaheadonplaced.ui.theme.ComposeCourseModifierLookaheadOnPlacedTheme

class MainActivity : ComponentActivity() {
  @OptIn(ExperimentalComposeUiApi::class)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeCourseModifierLookaheadOnPlacedTheme {
        OnPlacedModifier
        OnRemeasuredModifier
        LookaheadLayout(content = {
          Row(Modifier.onPlaced { lookaheadCoordinates, coordinates ->

          }) {

          }
        }, measurePolicy =)
      }
    }
  }
}

for est