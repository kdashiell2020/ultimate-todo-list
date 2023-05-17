package com.cash.todo.task.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text

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
      title = "Make today count!",
      completed = false,
    )
  )
}

