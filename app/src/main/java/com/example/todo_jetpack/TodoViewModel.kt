package com.example.todo_jetpack

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel(){
    private var _todoList = MutableLiveData<List<Todo>>()
    var todoList : LiveData<List<Todo>> = _todoList

    fun getAllTodo(){

    }

    fun addTodo(){

    }

    fun deleteTodo(){

    }

}