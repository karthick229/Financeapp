package com.tirupathi.financeapp.ui.loan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Loan Page"
    }
    val text: LiveData<String> = _text
}