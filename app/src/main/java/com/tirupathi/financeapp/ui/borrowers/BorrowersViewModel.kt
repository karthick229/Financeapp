package com.tirupathi.financeapp.ui.borrowers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BorrowersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Borrowers Page"
    }
    val text: LiveData<String> = _text
}