package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class Adapter( val arraylist:ArrayList<Model>, val context:Context, val flag:Number):RecyclerView.Adapter<Adapter.myviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.myviewHolder {
       var root=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return myviewHolder(root)
    }

    override fun getItemCount(): Int {
       return arraylist.size
    }

    override fun onBindViewHolder(holder: Adapter.myviewHolder, position: Int) {
        holder.bind(arraylist.get(position))
    }

    inner class myviewHolder(private val view:View):RecyclerView.ViewHolder(view){

        val row_val=view.findViewById<TextView>(R.id.row_val)

        fun bind(model:Model){

            if(flag==0)  //for alphabets
            {
                row_val.text=model.Alphabet
            }
            if(flag==1)  //for number
                row_val.text=model.number.toString()


        }
    }
}