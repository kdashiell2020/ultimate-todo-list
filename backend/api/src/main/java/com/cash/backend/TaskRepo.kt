package com.cash.backend.api

interface TaskRepo {
  fun listOfTask(): List<Task>
}

data class Task(
  val taskId: String,
  val text: String,
  val completed: Boolean,
)
