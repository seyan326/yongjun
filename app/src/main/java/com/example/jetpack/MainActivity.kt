package com.example.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        var btn1 : Button = findViewById(R.id.button_first)
//        btn1.text = "abcd"

        //Kotlin Extemsions
//        button_first.text = "abcd"

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


    }
}