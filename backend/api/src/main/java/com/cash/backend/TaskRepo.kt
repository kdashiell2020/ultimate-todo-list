package com.cash.backend

import kotlinx.coroutines.flow.Flow

interface TaskRepo {
  fun listOfTask(): Flow<List<Task>>
}

data class Task(
  val taskId: String,
  val text: String,
  val completed: Boolean,
)
