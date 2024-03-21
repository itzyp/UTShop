package com.example.utshop.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.utshop.databinding.FragmentGalleryBinding
// Importa las actividades de cada edificio aquí

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonBuilding1.setOnClickListener {
            startActivity(Intent(context, Building1Activity::class.java))
        }

        binding.imageButtonBuilding2.setOnClickListener {
            startActivity(Intent(context, Building2Activity::class.java))
        }

        binding.imageButtonBuilding3.setOnClickListener {
            startActivity(Intent(context, Building3Activity::class.java))
        }

        binding.imageButtonBuilding4.setOnClickListener {
            startActivity(Intent(context, Building4Activity::class.java))
        }

        binding.imageButtonBuilding5.setOnClickListener {
            startActivity(Intent(context, Building5Activity::class.java))
        }
        binding.imageButtonBuilding6.setOnClickListener {
            startActivity(Intent(context, Building6Activity::class.java))
        }
        binding.imageButtonBuilding7.setOnClickListener {
            startActivity(Intent(context, Building7Activity::class.java))
        }
        binding.imageButtonBuilding8.setOnClickListener {
            startActivity(Intent(context, Building8Activity::class.java))
        }
        binding.imageButtonBuilding9.setOnClickListener {
            startActivity(Intent(context, Building9Activity::class.java))
        }


        // Listeners para los edificios
        // Esto los mandara al otra interfaz UwU
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
