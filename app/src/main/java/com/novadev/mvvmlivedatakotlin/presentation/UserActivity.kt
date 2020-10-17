package com.novadev.mvvmlivedatakotlin.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.presentation.entities.User
import com.novadev.mvvmlivedatakotlin.presentation.viewModel.UserViewModel
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    private var userList = arrayListOf<User>()
    lateinit var viewModel : UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        initView()
        initViewModel()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
    }

    private fun initView() {
        btSalvar.setOnClickListener {
            val user = User()
            user.age = etEdad.text.toString()
            user.name = etNombre.text.toString()
            userList.add(user)

            // ViewModel
            viewModel.addUser(user)
        }

        btVer.setOnClickListener {
            var result = ""
            var resultViewModel = ""
            userList.forEach {
                result += "${it.name} - ${it.age} \n"
            }
            tvUser.text = result

            viewModel.userList.forEach {
                resultViewModel += "${it.name} - ${it.age} \n"
            }

            tvUserViewModel.text = resultViewModel
        }
    }
}