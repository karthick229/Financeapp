package com.tirupathi.financeapp.activity


import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Point
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tirupathi.financeapp.R
import com.tirupathi.financeapp.databinding.ActivitySplashScreenBinding



class SplashScreenActivity : AppCompatActivity() {

    private val handler = Handler()
    lateinit var dataBinding: ActivitySplashScreenBinding

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        if (supportActionBar != null) {
            supportActionBar!!.hide();
        }
        val display = windowManager.defaultDisplay
        val size = Point()
        display.  getSize(size)
        val width = size.x
        val height = size.y



        handler.postDelayed({ // Checking for first time launch - before calling setContentView()
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }, 1500)
//        val myanim: Animation = AnimationUtils.loadAnimation(this, R.anim.transition)
//        dataBinding.img.startAnimation(myanim)

    }


}