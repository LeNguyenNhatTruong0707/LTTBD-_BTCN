package com.example.btcn_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonText = findViewById<Button>(R.id.buttonText)
        val buttonImage = findViewById<Button>(R.id.buttonImage)
        val buttonTextField = findViewById<Button>(R.id.buttonTextField)
        val buttonPasswordField = findViewById<Button>(R.id.buttonPasswordField)
        val buttonColumn = findViewById<Button>(R.id.buttonColumn)
        val buttonRow = findViewById<Button>(R.id.buttonRow)

        buttonText.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "Text")
            startActivity(intent)
        }

        buttonImage.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "Image")
            startActivity(intent)
        }

        buttonTextField.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "TextField")
            startActivity(intent)
        }

        buttonPasswordField.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "PasswordField")
            startActivity(intent)
        }

        buttonColumn.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "Column")
            startActivity(intent)
        }

        buttonRow.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("component", "Row")
            startActivity(intent)
        }
    }
}