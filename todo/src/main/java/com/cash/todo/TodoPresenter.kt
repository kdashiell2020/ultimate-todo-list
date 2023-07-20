package com.cash.todo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.cash.backend.Task
import com.cash.backend.TaskRepo
import com.cash.todo.task.views.TaskViewModel

class TodoPresenter(
    private val repo: TaskRepo,
) {

    @Composable
    fun models(): ToDoViewModel {
        val todoList by remember { repo.listOfTask() }.collectAsState(emptyList())

        return ToDoViewModel(
            title = "My ToDo List",
            taskViewModel = todoList.toViewModels()
        )
    }

    private fun List<Task>.toViewModels() : List<TaskViewModel> {
        return map { task ->
            TaskViewModel(
                taskId = task.taskId,
                text = task.text,
                completed = task.completed
            )
        }

    }
}