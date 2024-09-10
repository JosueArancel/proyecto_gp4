package com.example.taskpro

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpro.R

class DashboardManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_manager)

        val btnExcel: Button = findViewById(R.id.btnExcel)
        val btnProyectos: Button = findViewById(R.id.btnProyectos)
        val btnEquipos: Button = findViewById(R.id.btnEquipos)

        btnExcel.setOnClickListener {
            Toast.makeText(this, "Exportando a Excel...", Toast.LENGTH_SHORT).show()
            // Lógica para exportar a Excel
        }

        btnProyectos.setOnClickListener {
            Toast.makeText(this, "Mostrando Proyectos...", Toast.LENGTH_SHORT).show()
            // Lógica para mostrar proyectos
        }

        btnEquipos.setOnClickListener {
            Toast.makeText(this, "Mostrando Equipos...", Toast.LENGTH_SHORT).show()
            // Lógica para mostrar equipos
        }
    }
}
