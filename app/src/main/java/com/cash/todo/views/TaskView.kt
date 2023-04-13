package com.example.mytodolist.tasks

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

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

