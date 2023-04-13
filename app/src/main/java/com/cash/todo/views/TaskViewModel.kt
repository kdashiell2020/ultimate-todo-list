package com.example.mytodolist.tasks

data class TaskViewModel(
  val taskId: String,
  val title: String,
  val completed: Boolean,
)