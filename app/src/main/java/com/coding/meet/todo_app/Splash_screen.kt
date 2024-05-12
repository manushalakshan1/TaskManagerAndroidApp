package com.coding.meet.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class Splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Using a Handler to delay launching the next activity
        Handler().postDelayed({
            // Start the next activity after the delay
            startActivity(Intent(this@Splash_screen, MainActivity::class.java))
            // Finish the splash activity so the user can't go back to it
            finish()
        }, 1000)
    }
}