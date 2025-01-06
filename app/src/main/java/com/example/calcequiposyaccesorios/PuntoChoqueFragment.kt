package com.example.calcequiposyaccesorios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.math.*

class PuntoChoqueFragment : Fragment(){
/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el diseño del fragmento
        return inflater.inflate(R.layout.fragment_punto_choque, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    val view = inflater.inflate(R.layout.fragment_punto_choque, container, false)

        val etAltura = view.findViewById<EditText>(R.id.etAltura_pc)
        val etRadio = view.findViewById<EditText>(R.id.etRadio_pc)
        val etAngulo = view.findViewById<EditText>(R.id.etAngulo_pc)
        val etDistancia = view.findViewById<EditText>(R.id.etDistancia_pc)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular_pc)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado_pc)

        btnCalcular.setOnClickListener {
            val alturaInicial = etAltura.text.toString().toDoubleOrNull() ?: 0.0
            val radio = etRadio.text.toString().toDoubleOrNull() ?: 0.0
            val angulo = etAngulo.text.toString().toDoubleOrNull() ?: 0.0
            val distanciaPluma = etDistancia.text.toString().toDoubleOrNull() ?: 0.0

            val resultado = calcularPuntoChoque(
                alturaInicial,
                radio,
                angulo,
                distanciaPluma
            )

            tvResultado.text = resultado
    }

    return view
}

    private fun calcularPuntoChoque(
        alturaInicial: Double,
        radio: Double,
        angulo: Double,
        distanciaPluma: Double
    ): String {
        val g = 9.81 // Gravedad
        val anguloRad = Math.toRadians(angulo)
/*
        // Componentes de la velocidad inicial
        val velocidadX = velocidadInicial * cos(anguloRad)
        val velocidadY = velocidadInicial * sin(anguloRad)

        // Tiempo hasta la distancia horizontal
        val tiempo = distanciaPluma / velocidadX

        // Altura en ese tiempo
        val alturaChoque = alturaInicial + (velocidadY * tiempo) - (0.5 * g * tiempo * tiempo)
*/
        val largoplumasacado=radio/cos(anguloRad)
        val alturaChoque=alturaInicial-largoplumasacado
        return if (alturaChoque >= 0) {
            "Altura de choque: ${"%.2f".format(alturaChoque)} m\nChoque con la pluma."
        } else {
            "No hay choque, la pieza cae antes de la pluma."
        }
    }
} // CIERRE FINAL