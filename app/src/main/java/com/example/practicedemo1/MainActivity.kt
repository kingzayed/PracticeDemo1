package com.example.practicedemo1

/**
 * Zayed Sayeed Shaikh
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton()
        subtractButton()
        multiplyButton()
        divideButton()
    }

    private fun addButton() {
        val edtFN = findViewById<EditText>(R.id.edt1)
        val edtSN = findViewById<EditText>(R.id.edt2)
        val edtAW = findViewById<EditText>(R.id.edt3)
        val btn = findViewById<Button>(R.id.btnAdd)
        btn.setOnClickListener {
            val number1 = edtFN.text.toString().toInt()
            val number2 = edtSN.text.toString().toInt()

            val result = number1 + number2

            edtAW.setText(result.toString())
        }
    }

    private fun subtractButton() {
        val edtFN = findViewById<EditText>(R.id.edt1)
        val edtSN = findViewById<EditText>(R.id.edt2)
        val edtAW = findViewById<EditText>(R.id.edt3)
        val btn = findViewById<Button>(R.id.btnSubt)
        btn.setOnClickListener {
            val number1 = edtFN.text.toString().toInt()
            val number2 = edtSN.text.toString().toInt()

            val result = number2 - number1

            edtAW.setText(result.toString())
        }
    }

    private fun multiplyButton() {
        val edtFN = findViewById<EditText>(R.id.edt1)
        val edtSN = findViewById<EditText>(R.id.edt2)
        val edtAW = findViewById<EditText>(R.id.edt3)
        val btn = findViewById<Button>(R.id.btnMult)
        btn.setOnClickListener {
            val number1 = edtFN.text.toString().toInt()
            val number2 = edtSN.text.toString().toInt()

            val result = number1 * number2

            edtAW.setText(result.toString())
        }
    }

    private fun divideButton() {
        val edtFN = findViewById<EditText>(R.id.edt1)
        val edtSN = findViewById<EditText>(R.id.edt2)
        val edtAW = findViewById<EditText>(R.id.edt3)
        val btn = findViewById<Button>(R.id.btnDivide)
        btn.setOnClickListener {
            val number1 = edtFN.text.toString().toInt()
            val number2 = edtSN.text.toString().toInt()

            val result = number1 / number2

            edtAW.setText(result.toString())
        }
    }
}