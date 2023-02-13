package com.example.immigrantev2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Tap to alert."
//        value = "Empuje para alertar."
    }
    val text: LiveData<String> = _text
}