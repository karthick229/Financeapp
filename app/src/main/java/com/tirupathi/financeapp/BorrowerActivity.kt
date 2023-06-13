package com.tirupathi.financeapp

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.tirupathi.financeapp.databinding.ActivityMainBinding
import com.tirupathi.financeapp.databinding.ActivityMainsBinding

class BorrowerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title = getString(R.string.create)

Log.e("Sujata","testing")
    }
}