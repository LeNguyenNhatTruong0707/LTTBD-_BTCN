package com.example.bt2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khai báo các thành phần giao diện
        val editTextName = findViewById<EditText>(R.id.editTextText)
        val editTextAge = findViewById<EditText>(R.id.editTextNumber)
        val buttonCheck = findViewById<Button>(R.id.button)
        val textViewResult = findViewById<TextView>(R.id.textViewKetQua) // ID của dòng kết quả

        // Gắn sự kiện khi nhấn nút
        buttonCheck.setOnClickListener {
            val name = editTextName.text.toString()
            val ageText = editTextAge.text.toString()

            if (name.isNotEmpty() && ageText.isNotEmpty()) {
                val age = ageText.toInt()
                val type = when {
                    age < 2 -> "trẻ sơ sinh"
                    age < 12 -> "trẻ em"
                    age < 60 -> "người lớn"
                    else -> "người già"
                }
                textViewResult.text = "$name là $type."
            } else {
                textViewResult.text = "Vui lòng nhập đầy đủ họ tên và tuổi."
            }
        }
    }
}
