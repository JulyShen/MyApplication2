package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var btOk:Button
    lateinit var tvName:TextView
    lateinit var btclear:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 把介面布局檔的元件抓到程式裏頭的物件
         etName = findViewById(R.id.etName)
         btOk = findViewById(R.id.btOk)
         tvName = findViewById(R.id.tvName)
         btclear= findViewById(R.id.btClear)
        btOk.setOnClickListener {
            tvName.text = etName.text
        }
        btclear.setOnClickListener {
            tvName.text = ""
        }
    }
}