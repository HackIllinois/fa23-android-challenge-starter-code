package com.example.fa23_android_challenge_starter_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* Create an event info page that displays an event's details.
 * Make a GET API call to the HackIllinois API event endpoint
 * Recommended: use Retrofit to create HTTP requests
 * Remember to add the libraries you want to use to your build.gradle file!
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}