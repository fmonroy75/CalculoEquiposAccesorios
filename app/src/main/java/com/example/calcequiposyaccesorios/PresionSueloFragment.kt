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

class PresionSueloFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el diseño del fragmento
        return inflater.inflate(R.layout.fragment_presion_suelo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etPeso = view.findViewById<EditText>(R.id.etPeso_ps)
        val etArea = view.findViewById<EditText>(R.id.etArea_ps)
        val etCapacidad = view.findViewById<EditText>(R.id.etCapacidad_ps)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular_ps)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado_ps)

        btnCalcular.setOnClickListener {
            val peso = etPeso.text.toString().toDoubleOrNull() ?: 0.0
            val area = etArea.text.toString().toIntOrNull() ?: 1
            val capacidad = etCapacidad.text.toString().toDoubleOrNull() ?: 1.0


            val fuerza = (peso * 9.81)/area
            if (fuerza<=capacidad){
                tvResultado.setTextColor(Color.parseColor("#000000")) // negro
                tvResultado.text = "Capacidad del suelo: %.2fkPa\n Apto".format(fuerza)
            }else{
                tvResultado.setTextColor(Color.parseColor("#FF0000")) // Rojo
                tvResultado.text = "Capacidad del suelo: %.2fkPa\n No Apto".format(fuerza)
            }


        }
    }
}
