package com.cash.todo.task.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text

@Composable
fun TaskView(model: TaskViewModel) {
        // card background
        // Button for completion
    Text(
      text = model.text,
    )
}

@Preview
@Composable
fun TaskViewPreview() {
  TaskView(
    TaskViewModel(
      taskId = "001",
      text = "Make today count!",
      completed = false,
    )
  )
}

