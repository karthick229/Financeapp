package com.tirupathi.financeapp.ui.collections

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CollectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Collection Page"
    }
    val text: LiveData<String> = _text
}