package com.example.appserba.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.appserba.R
import com.example.appserba.databinding.ActivityAuthBinding
import com.example.appserba.databinding.ActivityMainBinding
import com.example.appserba.ui.auth.AppserbaAuth
import com.example.appserba.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.buttonLogout.setOnClickListener{
            AppserbaAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}