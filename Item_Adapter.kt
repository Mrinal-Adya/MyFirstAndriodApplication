package com.example.myapplication
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*
import kotlin.math.log

class ItemAdapter(val context : Context,val  items:List<Item>) : RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun setData(item:Item,pos:Int){

            itemView.txvTitle.text = item!!.title

        }
    }
    val TAG = "MyActivity1"
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ItemAdapter.MyViewHolder {

       val view  = LayoutInflater.from(context).inflate(R.layout.list_item,null)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(p0: ItemAdapter.MyViewHolder, p1: Int) {

        val item = items[p1]
        p0.setData(item,p1)

        p0.itemView.setOnClickListener {

            val msg = items[p1].description
            Log.v(TAG,msg)
            val intent = Intent(p0.itemView.context,ItemDes::class.java)
            intent.putExtra("itemID",msg)
            p0.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

}

