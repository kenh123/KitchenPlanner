package com.example.kitchenplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kitchenplanner.databinding.ActivityMainBinding

class BarcodeScanning : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        //setContentView(R.layout.activity_barcode_scanning)
    }
}