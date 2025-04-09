package edu.msudenver.cs3013.jetpackfragments

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        Log.d("NAV", "========== MAIN super onCreate done ==========")
        setContentView(R.layout.activity_main)
        Log.d("NAV", "========== MAIN contentView set ==========")

    }
}