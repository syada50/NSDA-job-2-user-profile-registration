package com.example.job2_demo_userregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var listButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button for Profile List and set up the click event
        listButton = findViewById(R.id.profileListBtn)
        listButton.setOnClickListener {
            openLoadingActivity()
        }
    }

    // Open the loading activity and pass the target activity (ProfileListActivity)
    private fun openLoadingActivity() {
        val intent = Intent(this, LoadingActivity::class.java)
        intent.putExtra("TARGET_ACTIVITY", "com.example.job2_demo_userregistration.ProfileListActivity")
        startActivity(intent)
    }
}


