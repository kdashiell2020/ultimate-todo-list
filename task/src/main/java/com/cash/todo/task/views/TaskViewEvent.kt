package com.cash.todo.task.views

sealed class TaskViewEvent {
    data class Add(val task: String): TaskViewEvent()
    data class Compete(val taskId: String): TaskViewEvent()
    data class Delete(val taskId: String): TaskViewEvent()
}