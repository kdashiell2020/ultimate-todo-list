package com.cash.todo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cash.todo.task.views.TaskView
import com.cash.todo.task.views.TaskViewModel

@Composable
fun TodoListView(toDoViewModel: ToDoViewModel, onEvent: (TodoViewEvent) -> Unit) {
    TodoList(model = toDoViewModel)
}

@Composable
private fun TodoList(model: ToDoViewModel) {
        Column(
            modifier =Modifier.padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = model.title,
                fontSize = 25.sp,
            )

            LazyColumn {
                items(model.taskViewModel) { task ->
                    TaskView(task)
                }
            }

            Button(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .shadow(55.dp, shape = RoundedCornerShape(8.dp)),
                onClick = { /* TODO: completion */ }
            ) {}
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
        ),
        onEvent = {}
    )
}
