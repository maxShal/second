package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var editText: EditText
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.textView)
        editText = findViewById(R.id.editTextText)
        val imageButton: ImageButton = findViewById(R.id.imageButton2)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
      /*  imageButton.setOnClickListener{
            helloTextView.text = "Hello Kitty"
        }*/
        imageButton.setOnClickListener{
            if(editText.text.isEmpty())
            {
                helloTextView.text = "Hello Kitty";
            }else{
                helloTextView.text = "Привет, " + editText.text
            }
        }
    }
}