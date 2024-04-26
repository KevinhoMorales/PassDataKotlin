package com.kevinhomorales.passdatakotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kevinhomorales.passdatakotlin.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {
    lateinit var binding: ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        setUpActions()
    }

    private fun setUpActions() {
        binding.buttonBId.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.putExtra("text", binding.textValueId.text)
            startActivity(intent)
        }
    }

}