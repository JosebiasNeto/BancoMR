package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivSaldo.setOnClickListener{
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        binding.ivFatura.setOnClickListener{
            val intent = Intent(this, Fatura::class.java)
            startActivity(intent)
            finish()
        }
    }
}