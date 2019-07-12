package com.example.tax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.button_action.*
import kotlinx.android.synthetic.main.view_time.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chronometer = findViewById<Chronometer>(R.id.chronometer)

        btnStart.setOnClickListener {
            tvPrice.text="$ 0.45"
            chronometer.start()
        }
        btnEnd.setOnClickListener {
            chronometer.stop()
        }
        //Go map
        btnLook.setOnClickListener {
            val intent: Intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}
