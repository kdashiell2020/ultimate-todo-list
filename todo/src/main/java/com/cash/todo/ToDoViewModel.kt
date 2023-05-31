package com.cash.todo

import com.cash.todo.task.views.TaskViewModel

data class ToDoViewModel(
    val title: String,
    val taskViewModel: List<TaskViewModel>,
)
