package com.cash.backend

class RealTaskRepo : TaskRepo {
    override fun listOfTask(): List<Task> {
        return listOf(
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
    }

}