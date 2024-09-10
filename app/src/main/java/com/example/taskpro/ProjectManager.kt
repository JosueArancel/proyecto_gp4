package com.example.taskpro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ProjectManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_manager)

        val etCodigoProyecto: EditText = findViewById(R.id.etCodigoProyecto)
        val etDescripcion: EditText = findViewById(R.id.etDescripcion)
        val etCampana: EditText = findViewById(R.id.etCampana)
        val btnNuevo: Button = findViewById(R.id.btnNuevo)
        val btnGrabar: Button = findViewById(R.id.btnGrabar)
        val btnModificar: Button = findViewById(R.id.btnModificar)
        val lvProyectos: ListView = findViewById(R.id.lvProyectos)

        btnNuevo.setOnClickListener {
            etCodigoProyecto.text.clear()
            etDescripcion.text.clear()
            etCampana.text.clear()
            Toast.makeText(this, "Nuevo proyecto", Toast.LENGTH_SHORT).show()
        }

        btnGrabar.setOnClickListener {
            val codigo = etCodigoProyecto.text.toString()
            val descripcion = etDescripcion.text.toString()
            val campana = etCampana.text.toString()
            if (codigo.isNotEmpty() && descripcion.isNotEmpty() && campana.isNotEmpty()) {
                // Lógica para grabar el proyecto
                Toast.makeText(this, "Proyecto grabado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

        btnModificar.setOnClickListener {
            // Lógica para modificar el proyecto
            Toast.makeText(this, "Proyecto modificado", Toast.LENGTH_SHORT).show()
        }
    }
}