package com.catalin.jetpacknavigationtutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen() {
    val elements = MutableList(100) { it }
    LazyColumn(modifier = Modifier.background(Color.LightGray)) {
        items(elements) {
            Row(modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(4.dp))
                .background(Color.White)
                .padding(4.dp)
                .clickable { /* TODO */ }
            ) {
                Text(text = "Element $it")
            }
        }
    }
}