package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 把介面布局檔的元件抓到程式裏頭的物件
        val etName = findViewById<EditText>(R.id.etName)
        val btOk = findViewById<Button>(R.id.btOk)
        val tvName = findViewById<TextView>(R.id.tvName)

        btOk.setOnClickListener {
            tvName.text = etName.text
        }
    }
}