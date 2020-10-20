package com.novadev.mvvmlivedatakotlin.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.novadev.mvvmlivedatakotlin.presentation.entities.User

class DBLiveDataViewModel : ViewModel(){
    private var user: MutableLiveData<User> = MutableLiveData()
    var visibility: MutableLiveData<Boolean> = MutableLiveData()
    var size: MutableLiveData<Float> = MutableLiveData(30f)
    fun getUser(): LiveData<User> =  user

    fun setUser(user : User){
        this.user.value = user
    }

    fun updateUser (){
        val user = User("Lucía", "28")
        this.user.value = user
    }

    fun setVisibility(visibility: Boolean){
        this.visibility.value = visibility
    }

    fun changeVisibility(){
        visibility.value = visibility.value != true
        this.size.value = 16f
    }
}