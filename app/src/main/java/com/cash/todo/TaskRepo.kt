package com.cash.todo

interface TaskRepo {
  fun completeTask(id: String): Boolean

  fun deleteTask(id: String): Boolean

  fun addTask(task: Task): List<Task>

  fun listOfTask(): List<Task>
}

data class Task(
  val taskId: String,
  val text: String,
  val completed: Boolean,
)