package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnLetsShop.setOnClickListener{
           val intent = Intent(this,ShopActivity::class.java)
           startActivity(intent)

       }
//        var msg: String = "Hehe I am"
//        textView.text =msg
    }
}