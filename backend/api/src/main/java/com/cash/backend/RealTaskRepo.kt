package com.cash.backend

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RealTaskRepo : TaskRepo {
    override fun listOfTask(): Flow<List<Task>> {
        return flowOf(
            listOf(
                Task(
                    taskId = "001",
                    text = "Our List",
                    completed = false,
                ),
                Task(
                    taskId = "002",
                    text = "Another one",
                    completed = false,
                ),
            )
        )
    }

}