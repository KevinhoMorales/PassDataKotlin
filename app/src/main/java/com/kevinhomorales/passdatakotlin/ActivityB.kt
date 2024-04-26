package com.kevinhomorales.passdatakotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kevinhomorales.passdatakotlin.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {
    lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }
    private fun setUpView() {
        val nombre = intent.getStringExtra("text")
        binding.textValueId.setText(nombre)
        setUpActions()
    }

    private fun setUpActions() {
        binding.buttonBId.setOnClickListener {
            onBackPressed()
        }
    }
}