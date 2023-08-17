package com.cash.todo

sealed class TodoViewEvent {
    data class Add(val task: String): TodoViewEvent()
    data class Compete(val taskId: String): TodoViewEvent()
    data class Delete(val taskId: String): TodoViewEvent()
}