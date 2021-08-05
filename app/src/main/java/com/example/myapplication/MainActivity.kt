package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView1:RecyclerView
    val list1= ArrayList<Model>()

    lateinit var recyclerView2:RecyclerView
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var i=0
        var c='A'
        while(i<10)
        {
            val model=Model("$c",i)
            list1.add(model)
            i++
            c++
        }

        recyclerView1=findViewById(R.id.rv1)
        recyclerView2=findViewById(R.id.rv2)
        recyclerView1.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false);
        recyclerView2.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false);



        //adapter for both recycler view is same. I have used flags to differentiate

        val adapter=Adapter(list1,this,0)
        recyclerView1.adapter=adapter
        val adapter1=Adapter(list1,this,1)
        recyclerView2.adapter=adapter1



    }
}