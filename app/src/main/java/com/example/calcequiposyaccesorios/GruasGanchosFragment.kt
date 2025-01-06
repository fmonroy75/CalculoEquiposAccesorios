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

class GruasGanchosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el diseño del fragmento
        return inflater.inflate(R.layout.fragment_grua_gancho, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etPeso = view.findViewById<EditText>(R.id.etPeso_gg1)
        val etCapacidad = view.findViewById<EditText>(R.id.etCapacidadNominal_gg1)
        val etRadio = view.findViewById<EditText>(R.id.etRadio_gg1)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular_gg1)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado_gg1)

        btnCalcular.setOnClickListener {
            val peso = etPeso.text.toString().toDoubleOrNull() ?: 0.0
            val capacidad = etCapacidad.text.toString().toIntOrNull() ?: 1
            val radio = etRadio.text.toString().toDoubleOrNull() ?: 1.0


            val momentum = peso * 9.81 * radio
            if (momentum<=(capacidad*9.81)){
                tvResultado.setTextColor(Color.parseColor("#000000")) // negro
                tvResultado.text = "Momentum: %.2fkg\n Dentro del limite".format(momentum/9.81)
            }else{
                tvResultado.setTextColor(Color.parseColor("#FF0000")) // Rojo
                tvResultado.text = "Momentum: %.2fkg\n Excede del limite".format(momentum/9.81)
            }


        }
    }
}
