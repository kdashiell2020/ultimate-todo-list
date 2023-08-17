package com.cash.todo.task.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskView(model: TaskViewModel) {
    Card(
        Modifier
            .fillMaxSize()
            .padding(10.dp)
            .clip(RoundedCornerShape(40.dp))
            .shadow(40.dp, shape = RoundedCornerShape(8.dp), ambientColor = Color.Black)
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
           Text(
               text = model.text,
               fontSize = 20.sp,
           )

            Button(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .shadow(55.dp, shape = RoundedCornerShape(8.dp)),//.height(30.dp).width(30.dp),
                onClick = { /* TODO: completion */ }
            ) {}
        }

    }
}

@Preview
@Composable
fun TaskViewPreview() {
  TaskView(
    TaskViewModel(
      taskId = "001",
      text = "Make today count!",
      completed = false,
    )
  )
}

