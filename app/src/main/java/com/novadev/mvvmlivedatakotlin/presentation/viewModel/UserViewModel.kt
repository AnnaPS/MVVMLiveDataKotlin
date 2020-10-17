package com.novadev.mvvmlivedatakotlin.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.novadev.mvvmlivedatakotlin.presentation.entities.User

class UserViewModel : ViewModel(){

    var userList : MutableList<User> = mutableListOf()

    fun addUser(user: User){
        userList.add(user)
    }
}