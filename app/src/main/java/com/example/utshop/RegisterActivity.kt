package com.example.utshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Log.i("dato","On create")

    }
    override fun onStart() {
        super.onStart()
        Log.i("cicloVida", "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida","On resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("dato","On pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("dato","On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("dato","On destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("dato","On restart")
    }
}



