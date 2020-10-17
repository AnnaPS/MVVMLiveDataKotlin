package com.novadev.mvvmlivedatakotlin.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.novadev.mvvmlivedatakotlin.presentation.entities.User

class LiveDataViewModel : ViewModel(){

    var userListLiveData: MutableLiveData<List<User>> = MutableLiveData()
    var userList: MutableList<User> = mutableListOf()

    // Live data es solo de lectura y mutable live data es lectura y escritura
    fun getUserList(): LiveData<List<User>> = userListLiveData

    fun addUser(user : User){
        userList.add(user)
        userListLiveData.value = userList
    }


}