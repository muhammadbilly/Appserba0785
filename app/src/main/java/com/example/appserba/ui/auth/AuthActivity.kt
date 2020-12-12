package com.example.appserba.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.appserba.R
import com.example.appserba.data.model.AuthUser
import com.example.appserba.databinding.ActivityAuthBinding
import com.example.appserba.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSucces(user: AuthUser?){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}