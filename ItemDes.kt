package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.item_description.*
import kotlinx.android.synthetic.main.list_item.view.*


class ItemDes : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MyActivity"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_description)

        val bundle:Bundle? = this.intent.extras
        val msg = bundle!!.getString("itemID")
        itemDes.text =msg

        btnCarAdded.setOnClickListener {
            Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show()
        }


    }

}