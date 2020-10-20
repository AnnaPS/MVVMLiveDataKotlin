package com.novadev.mvvmlivedatakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.databinding.ActivityDBLivedataBinding
import com.novadev.mvvmlivedatakotlin.presentation.entities.User
import com.novadev.mvvmlivedatakotlin.presentation.viewModel.DBLiveDataViewModel

class DBLivedataActivity : AppCompatActivity() {
    lateinit var viewModel : DBLiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_b_livedata)

        initViewModel()
        initView()
    }

    private fun initView() {
        val binding : ActivityDBLivedataBinding = DataBindingUtil.setContentView(
            this@DBLivedataActivity, R.layout.activity_d_b_livedata
        )
        // Indica el propietario del ciclo de vide de databinding
        binding.lifecycleOwner = this

        binding.viewModel = viewModel
        val user = User("Alberto", "43")
        viewModel.setUser(user)

    }

    private fun initViewModel() {
       viewModel = ViewModelProvider(this).get(DBLiveDataViewModel::class.java)
    }
}