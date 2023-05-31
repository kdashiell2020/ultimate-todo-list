package com.cash.todo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cash.todo.task.views.TaskView
import com.cash.todo.task.views.TaskViewModel

@Composable
fun TodoListView(toDoViewModel: ToDoViewModel) {
    Column {

        Text(toDoViewModel.title)

//        Column {
//            for (task in toDoViewModel.taskViewModel) {
//                TaskView(task)
//            }
//        }

        LazyColumn {
            items(toDoViewModel.taskViewModel) { task ->
                TaskView(task)
            }
        }
    }
}

@Preview
@Composable
fun TodoListViewPreview() {
    TodoListView(
        toDoViewModel = ToDoViewModel(
            title = "Make today count!",
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
    )
}
