package com.examples.testunitarios

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mResultado: TextView? = null
    private var mNumero1: EditText? = null
    private var mNumero2: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        mResultado = findViewById<View>(R.id.tvResultado) as TextView
        mNumero1 = findViewById<View>(R.id.edNumero1) as EditText
        mNumero2 = findViewById<View>(R.id.edNumero2) as EditText
    }
}