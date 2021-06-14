package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityFaturaBinding
import com.example.bancomr.databinding.ActivitySaldoBinding

class Fatura : AppCompatActivity() {

    private lateinit var binding: ActivityFaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarFatura
        toolbar.title = "Fatura"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400, 0, 400, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}