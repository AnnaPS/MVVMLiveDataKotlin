package com.novadev.mvvmlivedatakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.presentation.entities.User
import com.novadev.mvvmlivedatakotlin.presentation.viewModel.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {
    private var num = 0
    private lateinit var viewModel : LiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        initListeners()
        initViewModel()
        initObserves()
    }

    private fun initObserves() {
        // Observer
        viewModel.getUserList().observe(this, Observer {
            var resultObserver = ""
            it.forEach {user ->
                resultObserver += "${user.name} - ${user.age} \n"
            }
            tvLiveData.text = resultObserver
        })
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)
    }

    private fun initListeners() {
        btSave.setOnClickListener {
            if(num == 0){
                val user = User()
                user.name = "NovaDev"
                user.age = "29"
                viewModel.addUser(user)
            }
            if(num == 1){
                val user = User()
                user.name = "AnaPS"
                user.age = "30"
                viewModel.addUser(user)
            }
            num++
        }
    }
}