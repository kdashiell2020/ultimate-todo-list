package com.cash.todo

import androidx.compose.runtime.Composable
import com.cash.backend.TaskRepo
import com.cash.todo.task.views.TaskViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class TodoPresenter(
//    private val repo: TaskRepo,
) {

    @Composable
    fun models(): ToDoViewModel {

        return ToDoViewModel(
            title = "The Todo List",
            taskViewModel = listOf(
                TaskViewModel(
                    taskId = "001",
                    text = "Our List",
                    completed = false,
                ),
                TaskViewModel(
                    taskId = "002",
                    text = "Another one",
                    completed = false,
                ),
            )
        )
    }
}