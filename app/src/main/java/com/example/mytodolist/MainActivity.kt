package com.example.mytodolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytodolist.ui.theme.MyTodoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTodoListTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TheUltimateTodo("Mic Check! 1-2, 1-2!")
                }
            }
        }
    }
}

@Composable
fun TheUltimateTodo(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TheUltimateTodoPreview() {
    MyTodoListTheme {
        TheUltimateTodo("Android")
    }
}

data class ToDoViewModel(
    val title: String,
    val taskList: List<TaskViewModel>,
)

data class TaskViewModel(
    val task: String,
    val isComplete: Boolean,
)
