package com.example.taskpro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpro.databinding.ActivityMyTodoListBinding

class MyTodoList : AppCompatActivity() {

    private lateinit var binding: ActivityMyTodoListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_todo_list)

        val lvActividades: ListView = findViewById(R.id.lvActividades)

        val actividades = arrayOf(
            "Proyecto 001 - actividad 1",
            "Proyecto 002 - actividad 1",
            "Proyecto 003 - actividad 1",
            "Proyecto 004 - actividad 1",
            "Proyecto 005 - actividad 1",
            "Proyecto 006 - actividad 1"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, actividades)
        lvActividades.adapter = adapter
    }

}