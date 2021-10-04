package com.bekirgy.todolist

interface UpdateAndDelete {

    fun modifyItem(itemUID : String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}