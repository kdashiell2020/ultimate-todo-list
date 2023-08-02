package com.cash.todo

sealed class TodoViewViewEvent {
    data class Add(val task: String): TodoViewViewEvent()
    data class Compete(val taskId: String): TodoViewViewEvent()
    data class Delete(val taskId: String): TodoViewViewEvent()
}