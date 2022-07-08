package com.example.infinitycircle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClockWise = findViewById<Button>(R.id.clockWise)
        val btnAntiClckWise = findViewById<Button>(R.id.antiClockwise)

        btnClockWise.setOnClickListener {

            val image = findViewById<ImageView>(R.id.imageView)

            val animation: Animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.clockwise)

            image.startAnimation(animation)
        }

        btnAntiClckWise.setOnClickListener {

            val image = findViewById<ImageView>(R.id.imageView)

            val animation: Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anticlock)

            image.startAnimation(animation)


        }

    }


}