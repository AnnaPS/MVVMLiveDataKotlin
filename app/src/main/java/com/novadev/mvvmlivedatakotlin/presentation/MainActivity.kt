package com.novadev.mvvmlivedatakotlin.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novadev.mvvmlivedatakotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
    }

    private fun initListeners() {
        btViewModel.setOnClickListener {
            startActivity(Intent(applicationContext, SumActivity::class.java))
        }

        btUserViewModel.setOnClickListener {
            startActivity(Intent(applicationContext, UserActivity::class.java))
        }

        btLiveData.setOnClickListener {
            startActivity(Intent(applicationContext, LiveDataActivity::class.java))
        }

        btDataBinding.setOnClickListener {
            startActivity(Intent(applicationContext, DataBindingActivity::class.java))
        }
//
//        btDBLABinding.setOnClickListener {
//            startActivity(Intent(applicationContext, DataBindingActivity::class.java))
//        }

    }
}