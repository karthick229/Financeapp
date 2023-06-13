package com.tirupathi.financeapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.tirupathi.financeapp.databinding.ActivityBorrowersBinding

class LoanActivity: AppCompatActivity (){
    private lateinit var binding: ActivityBorrowersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBorrowersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}