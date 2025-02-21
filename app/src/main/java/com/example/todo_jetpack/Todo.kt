package com.example.todo_jetpack

import java.time.Instant
import java.util.Date

data class Todo(
    var id : Int,
    var title : String,
    var createdAt : Date
)

fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
      Todo(1,"First todo ",Date.from(Instant.now())),
      Todo(2,"This is my second todo ",Date.from(Instant.now())),
      Todo(3,"The third one is here ",Date.from(Instant.now())),
      Todo(4,"Fourth todo item ",Date.from(Instant.now()))
    );
}
