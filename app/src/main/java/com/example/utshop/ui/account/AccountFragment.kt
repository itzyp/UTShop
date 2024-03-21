package com.example.utshop.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.utshop.databinding.ActivityAccountFragmentBinding

class AccountFragment : Fragment() {

    private var _binding: ActivityAccountFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = ActivityAccountFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Aquí puedes asignar los datos del usuario a los TextViews
        // Ejemplo:
        // binding.textViewName.text = "Nombre del Usuario"
        // binding.textViewEmail.text = "Correo del Usuario"
        // binding.textViewPhone.text = "Número Telefónico del Usuario"
        // binding.textViewBuilding.text = "Edificio del Usuario"

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSave.setOnClickListener {
            // Aquí puedes implementar la lógica para guardar los datos editados
            // Por ahora, solo mostraremos un Toast
            Toast.makeText(context, "Datos guardados (simulación)", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
