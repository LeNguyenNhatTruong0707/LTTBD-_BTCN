package com.example.bt2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val buttonCheck = findViewById<Button>(R.id.buttonCheck)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonCheck.setOnClickListener {
            val name = editTextName.text.toString()
            val ageText = editTextAge.text.toString()

            if (name.isEmpty() || ageText.isEmpty()) {
                textViewResult.text = "Vui lòng nhập đầy đủ họ tên và tuổi."
                return@setOnClickListener
            }

            val age = ageText.toIntOrNull()
            if (age == null) {
                textViewResult.text = "Tuổi không hợp lệ."
                return@setOnClickListener
            }

            val result = when {
                age <= 2 -> "Em bé"
                age <= 6 -> "Trẻ em"
                age <= 65 -> "Người lớn"
                else -> "Người già"
            }

            textViewResult.text = "Tên: $name\nPhân loại: $result"
        }
    }

}

