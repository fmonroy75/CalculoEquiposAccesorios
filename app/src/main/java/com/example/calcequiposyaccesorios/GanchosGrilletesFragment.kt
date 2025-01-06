package com.example.calcequiposyaccesorios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.graphics.Color

class GanchosGrilletesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el diseño del fragmento
        return inflater.inflate(R.layout.fragment_ganchos_grilletes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etPeso = view.findViewById<EditText>(R.id.etPeso_gg2)
        val etFactor = view.findViewById<EditText>(R.id.etFactor_gg2)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular_gg2)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado_gg2)

        btnCalcular.setOnClickListener {
            val peso = etPeso.text.toString().toDoubleOrNull() ?: 0.0
            val factor = etFactor.text.toString().toIntOrNull() ?: 1

            val minima = (peso  * factor)

            tvResultado.text = "Capacidad minima: %.2fkg\n ".format(minima)



        }
    }
}
