package com.cash.todo.task

interface TaskRepo {
  fun listOfTask(): List<Task>
}

data class Task(
  val taskId: String,
  val text: String,
  val completed: Boolean,
)
