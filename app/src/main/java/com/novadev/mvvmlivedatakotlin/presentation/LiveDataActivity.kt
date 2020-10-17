package com.novadev.mvvmlivedatakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.presentation.entities.User
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        initListeners()
    }

    private fun initListeners() {
        btSave.setOnClickListener {
            if(num == 0){
                val user = User()
                user.name = "NovaDev"
                user.age = "29"
            }
            if(num == 1){
                val user = User()
                user.name = "AnaPS"
                user.age = "30"
            }
        }
    }
}