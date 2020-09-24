package com.codelab.layoutscodelab

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.ExperimentalLayout
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.codelab.layoutscodelab.ui.LayoutsCodelabTheme

@OptIn(ExperimentalLayout::class)
@Composable
fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
    Row(modifier = modifier.preferredHeight(IntrinsicSize.Min)) {
        Text(text = text1, modifier = Modifier.weight(1f).padding(start = 4.dp))
        Divider(color = Color.Black, modifier = Modifier.fillMaxHeight().preferredWidth(1.dp))
        Text(text = text2, modifier = Modifier.weight(1f).padding(end = 4.dp).wrapContentWidth(Alignment.End))
    }
}

@Preview
@Composable
fun TwoTextsPreview() {
    LayoutsCodelabTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}
