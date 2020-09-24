package com.codelab.layoutscodelab

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.codelab.layoutscodelab.ui.LayoutsCodelabTheme

@Composable
fun ConstraintLayoutContent() {
    ConstraintLayout {

        val (button, text) = createRefs()

        Button(
            onClick = { /* Do something */ },
            // Assign reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text(text = "Button")
        }

        Text(text = "Text", Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 16.dp)
        })
    }
}

@Preview
@Composable
fun ConstraintLayoutContentPreview() {
    LayoutsCodelabTheme {
        ConstraintLayoutContent()
    }
}
