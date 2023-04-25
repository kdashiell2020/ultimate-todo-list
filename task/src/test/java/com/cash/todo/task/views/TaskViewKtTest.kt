package com.cash.todo.task.views

import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class TaskViewKtTest {
  @get:Rule
  val paparazzi = Paparazzi()

  @Test
  fun taskView() {
    paparazzi.snapshot {
      TaskView(
        TaskViewModel(
          taskId = "001",
          title = "Make today count!",
          completed = false,
        )
      )
    }
  }
}