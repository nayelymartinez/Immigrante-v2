package com.example.immigrantev2.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Household Info"
//        value = "Informacion de Hogar"
    }
    val text: LiveData<String> = _text
}