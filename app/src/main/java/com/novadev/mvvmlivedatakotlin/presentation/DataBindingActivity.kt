package com.novadev.mvvmlivedatakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.databinding.ActivityDataBindingBinding
import com.novadev.mvvmlivedatakotlin.presentation.entities.User

class DataBindingActivity : AppCompatActivity() {

    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding)

        initView()
    }

    private fun initView() {
        user = User(name = "NovaDev", age = "30")

        val binding: ActivityDataBindingBinding =
            DataBindingUtil.setContentView(
                this@DataBindingActivity, R.layout.activity_data_binding
            )

        binding.user = user
    }
}