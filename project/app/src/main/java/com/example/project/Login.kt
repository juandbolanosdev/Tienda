package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recoverPassword.setOnClickListener{
            startActivity(Intent(this, RecoverPasss::class.java))
        }

//        Register.setOnClickListener{
//            startActivity(Intent(this, Register::class.java))
//        }


    }
}