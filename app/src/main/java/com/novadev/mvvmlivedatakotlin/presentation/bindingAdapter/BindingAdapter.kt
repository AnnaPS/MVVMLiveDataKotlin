package com.novadev.mvvmlivedatakotlin.presentation.bindingAdapter

import android.opengl.Visibility
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("visibility")
    fun setVisibility(view: View, visibility: Boolean){
        if(visibility){
            view.visibility = View.VISIBLE
        }else{
            view.visibility = View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("size")
    fun setSize(view: TextView, size: Float){
        view.textSize = size
    }
}