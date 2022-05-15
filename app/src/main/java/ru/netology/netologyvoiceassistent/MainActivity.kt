package ru.netology.netologyvoiceassistent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(TAG, "Start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Ivan"
        val surname = "Ivanov"
        var age = 37
        var height = 172.2

        var summary: String =
            "name: " + name + " surname: " + surname + " age: " + age + " height: " + height

        val output: TextView = findViewById(R.id.output)
        output.text = summary

        Log.d(TAG,"End of onCreate function")
    }

}