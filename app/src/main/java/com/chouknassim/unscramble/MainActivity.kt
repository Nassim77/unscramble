package com.chouknassim.unscramble

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import chouknassim.unscramble.R

/**
 * Creates an Activity that hosts the Game fragment in the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}