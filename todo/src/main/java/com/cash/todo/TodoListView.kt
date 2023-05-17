package com.cash.todo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TodoListView() {
    Column {
        TopAppBar() {
            Text("All Task")
        }
    }
}

@Preview
@Composable
fun TodoListViewPreview() {
    TodoListView()
}