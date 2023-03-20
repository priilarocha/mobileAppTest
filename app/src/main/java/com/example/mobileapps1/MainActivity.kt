package com.example.mobileapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickEducation: Button = findViewById(R.id.button4)
        clickEducation.setOnClickListener { clickEducation() }
    }
}

private fun clickEducation() {

}
