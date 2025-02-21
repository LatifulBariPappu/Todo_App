package com.example.todo_jetpack

import java.util.Date

data class Todo(
    var id : Int,
    var title : String,
    var createdAt : Date
)
