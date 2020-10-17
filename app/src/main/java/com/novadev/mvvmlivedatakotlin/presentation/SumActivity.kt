package com.novadev.mvvmlivedatakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.novadev.mvvmlivedatakotlin.R
import com.novadev.mvvmlivedatakotlin.presentation.viewModel.SumViewModel
import com.novadev.mvvmlivedatakotlin.utils.Sum
import kotlinx.android.synthetic.main.activity_view_model.*

class SumActivity : AppCompatActivity() {

    lateinit var viewModel: SumViewModel

    private var resultSum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        initViewModel()
        initView()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(SumViewModel::class.java)
    }

    private fun initView() {
        tvSumar.text = "$resultSum"

        tvSumarViewModel.text = "${viewModel.resultSum}"

        btSumar.setOnClickListener {
            // Sin viewModel
            resultSum = Sum.sum(resultSum)
            tvSumar.text = "$resultSum"

            // Con viewModel
            viewModel.resultSum = Sum.sum(viewModel.resultSum)
            tvSumarViewModel.text = "${viewModel.resultSum}"
        }
    }
}