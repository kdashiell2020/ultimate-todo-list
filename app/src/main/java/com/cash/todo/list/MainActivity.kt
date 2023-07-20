package com.cash.todo.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import app.cash.molecule.RecompositionClock
import app.cash.molecule.launchMolecule
import com.cash.backend.RealTaskRepo
import com.cash.todo.TodoListView
import com.cash.todo.TodoPresenter
import com.example.todolist.ui.theme.MyTodoListTheme


class MainActivity : ComponentActivity() {
    private val todoPresenter = TodoPresenter(repo = RealTaskRepo())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTodoListTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val todoViewModel by lifecycleScope.launchMolecule(clock = RecompositionClock.Immediate) {
                        todoPresenter.models()
                    }.collectAsState()

                    TodoListView(toDoViewModel = todoViewModel)
                }
            }
        }
    }
}
