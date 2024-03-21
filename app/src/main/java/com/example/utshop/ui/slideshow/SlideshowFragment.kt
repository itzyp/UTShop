package com.example.utshop.ui.slideshow
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.utshop.databinding.FragmentSlideshowBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utshop.R


class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.fabAddProduct.setOnClickListener {
            // Navegar a la nueva actividad o fragmento para agregar producto
            val intent = Intent(activity, NewProductActivity::class.java)
            startActivity(intent)
        }

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Simulación de datos de productos
        val productList = listOf(
            Product(R.drawable.colegio, "Producto 1", "$10.00", true, "Descripción del Producto 1"),
            Product(R.drawable.colegio, "Producto 2", "$20.00", true, "Descripción del Producto 2")

            // Agrega más productos aquí
        )

        val adapter = ProductAdapter(productList,
            onEditClicked = { product ->
                val intent = Intent(activity, EditProductActivity::class.java)
                // Aquí puedes pasar datos extras si es necesario, por ejemplo:
                intent.putExtra("productName", product.name)
                intent.putExtra("productPrice", product.price)
                intent.putExtra("productDescription", product.description)
                intent.putExtra("productAvailability", product.isAvailable)
                intent.putExtra("productImageResource", product.imageResource)
                startActivity(intent)
            },
            onDeleteClicked = { product ->
                // Implementa la acción de eliminar aquí
            })
        binding.productsRecyclerView.adapter = adapter
        binding.productsRecyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


