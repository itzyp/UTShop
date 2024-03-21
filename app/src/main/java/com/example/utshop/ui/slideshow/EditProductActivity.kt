package com.example.utshop.ui.slideshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import com.example.utshop.R

class EditProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_product)

        // Obteniendo los datos pasados a esta actividad
        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")
        val productDescription = intent.getStringExtra("productDescription")
        val productAvailability = intent.getBooleanExtra("productAvailability", false)
        val productImageResource = intent.getIntExtra("productImageResource", 0)

        // Asignando valores a los componentes del formulario
        findViewById<EditText>(R.id.editTextProductName).setText(productName)
        findViewById<EditText>(R.id.editTextProductPrice).setText(productPrice)
        findViewById<EditText>(R.id.editTextProductDescription).setText(productDescription)
        findViewById<Switch>(R.id.switchProductAvailability).isChecked = productAvailability
        findViewById<ImageView>(R.id.imageProduct).setImageResource(productImageResource)
        // Continúa para los demás campos...
    }
}
