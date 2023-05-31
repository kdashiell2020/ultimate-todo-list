package cash.todo.task

import app.cash.paparazzi.Paparazzi
import com.cash.todo.task.views.TaskView
import com.cash.todo.task.views.TaskViewModel
import com.cash.todo.task.views.TaskViewPreview
import org.junit.Rule
import org.junit.Test

class TaskViewTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun taskView() {
        paparazzi.snapshot {
            TaskViewPreview()
        }
    }
}