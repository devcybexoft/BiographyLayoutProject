package com.example.biographylayoutproject

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstangit statusceState)
        setContentView(R.layout.main_layout)
        var  textViewBiography: TextView = findViewById(R.id.biography)
        textViewBiography.setText("""
            Biography is here
            Please visit LinkedIn profile
            https://www.linkedin.com/in/khimchenko
        """.trimIndent())
    }
}