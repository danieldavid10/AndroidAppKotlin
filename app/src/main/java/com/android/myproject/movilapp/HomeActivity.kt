package com.android.myproject.movilapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNexLayout = findViewById<Button>(R.id.btnNex)

        btnNexLayout.setOnClickListener { GoToNexActivity() }
    }

    private fun GoToNexActivity() = startActivity(Intent(this, HomeActivity::class.java))

}
