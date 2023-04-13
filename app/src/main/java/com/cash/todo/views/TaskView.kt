package com.cash.todo.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// TODO: create a view test using paparazzi
// TODO: move this to appropriate task module
@Composable
fun TaskView(model: TaskViewModel) {
  Text(
    text = model.title,
  )
}

@Preview
@Composable
fun TaskViewPreview() {
  TaskView(
    TaskViewModel(
      taskId = "001",
      title = "We here!",
      completed = false,
    )
  )
}

