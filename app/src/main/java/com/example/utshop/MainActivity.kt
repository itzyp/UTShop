package com.example.utshop

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            Log.i("cicloVida","ingresa On create")

        // Botón de registro ya existente
        val registerButton = findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Botón de inicio de sesión para navegar a InicioActivity
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Crear un Intent para iniciar la actividad InicioActivity
            val intent = Intent(this, Inicio::class.java)
            startActivity(intent)
            // Opcional: Finalizar MainActivity si no quieres que el usuario vuelva a esta pantalla al presionar "Atrás"
            finish()
        }
        Toast.makeText(this, "on create login", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Log.i("cicloVida", "on start")
        Toast.makeText(this, "on start login", Toast.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida","On resume")
        Toast.makeText(this, "on resume login", Toast.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida","On pause")
        Toast.makeText(this, "on pause login", Toast.LENGTH_LONG).show()

    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida","On stop")
        Toast.makeText(this, "on stop login", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida","On destroy")
        Toast.makeText(this, "on destroy login", Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("cicloVida","On restart")
        Toast.makeText(this, "on restart login", Toast.LENGTH_LONG).show()

    }
}





