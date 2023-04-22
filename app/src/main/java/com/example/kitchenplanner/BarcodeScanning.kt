package com.example.kitchenplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kitchenplanner.databinding.ActivityMainBinding
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning

class BarcodeScanning : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    private val options = GmsBarcodeScannerOptions.Builder().build()

    private val scanner = GmsBarcodeScanning.getClient(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        //setContentView(R.layout.activity_barcode_scanning)
        //TODO figure out what to put in these parts
        scanner.startScan()
            .addOnSuccessListener {barcode ->

            }
            .addOnCanceledListener {

            }
            .addOnFailureListener{e ->

            }

        //val rawValue: String? = barcode.rawValue
    }
}