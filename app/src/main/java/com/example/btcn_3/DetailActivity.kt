package com.example.btcn_3

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val component = intent.getStringExtra("component")
        val detailTitle = findViewById<TextView>(R.id.detailTitle)
        val detailContent = findViewById<LinearLayout>(R.id.detailContent)

        detailTitle.text = "$component Detail"

        when (component) {
            "Text" -> {
                val textView = TextView(this)
                textView.text = "The quick brown fox jumps over the lazy dog."
                textView.textSize = 18f
                detailContent.addView(textView)
            }
            "Image" -> {
                val imageView = ImageView(this)
                imageView.setImageResource(android.R.drawable.ic_menu_gallery)
                detailContent.addView(imageView)
            }
            "TextField" -> {
                val editText = EditText(this)
                editText.hint = "Type something here"
                detailContent.addView(editText)
            }
            "PasswordField" -> {
                val editText = EditText(this)
                editText.hint = "Enter your password"
                editText.inputType = android.text.InputType.TYPE_CLASS_TEXT or android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
                detailContent.addView(editText)
            }
            "Column" -> {
                val text1 = TextView(this)
                text1.text = "Item 1"
                text1.textSize = 18f
                detailContent.addView(text1)

                val text2 = TextView(this)
                text2.text = "Item 2"
                text2.textSize = 18f
                detailContent.addView(text2)

                val text3 = TextView(this)
                text3.text = "Item 3"
                text3.textSize = 18f
                detailContent.addView(text3)
            }
            "Row" -> {
                val rowLayout = LinearLayout(this)
                rowLayout.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                rowLayout.orientation = LinearLayout.HORIZONTAL

                val text1 = TextView(this)
                text1.text = "Item 1"
                text1.textSize = 18f
                text1.setPadding(16, 0, 16, 0)
                rowLayout.addView(text1)

                val text2 = TextView(this)
                text2.text = "Item 2"
                text2.textSize = 18f
                text2.setPadding(16, 0, 16, 0)
                rowLayout.addView(text2)

                val text3 = TextView(this)
                text3.text = "Item 3"
                text3.textSize = 18f
                text3.setPadding(16, 0, 16, 0)
                rowLayout.addView(text3)

                detailContent.addView(rowLayout)
            }
        }
    }
}