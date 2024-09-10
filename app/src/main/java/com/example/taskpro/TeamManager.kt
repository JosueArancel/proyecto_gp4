package com.example.taskpro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpro.R

class TeamManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_manager)

        val etCodigoEquipo: EditText = findViewById(R.id.etCodigoEquipo)
        val etNombreEquipo: EditText = findViewById(R.id.etNombreEquipo)
        val btnNuevo: Button = findViewById(R.id.btnNuevo)
        val btnGrabar: Button = findViewById(R.id.btnGrabar)
        val btnModificar: Button = findViewById(R.id.btnModificar)
        val lvEquipos: ListView = findViewById(R.id.lvEquipos)

        btnNuevo.setOnClickListener {
            etCodigoEquipo.text.clear()
            etNombreEquipo.text.clear()
            Toast.makeText(this, "Nuevo equipo", Toast.LENGTH_SHORT).show()
        }

        btnGrabar.setOnClickListener {
            val codigo = etCodigoEquipo.text.toString()
            val nombre = etNombreEquipo.text.toString()
            if (codigo.isNotEmpty() && nombre.isNotEmpty()) {
                // Lógica para grabar el equipo
                Toast.makeText(this, "Equipo grabado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnModificar.setOnClickListener {
            // Lógica para modificar el equipo
            Toast.makeText(this, "Equipo modificado", Toast.LENGTH_SHORT).show()
        }
    }
}
