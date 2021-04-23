package com.example.recyclerviewdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    val booklist=arrayListOf(
        "P.S I Love You",
        "The Great Gatsby",
        "Anna Karenina",
        "Madame Bovary",
        "War and Peace",
        "Loyalty",
        "Middle March",
        "The Adventures",
        "Mona Dick",
        "The Lord Of Rings"
    )
    lateinit var recylcerAdapter:RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        layoutManager=LinearLayoutManager(this)

        recylcerAdapter= RecyclerAdapter(this as Context,booklist)

        recyclerView.adapter=recylcerAdapter
        recyclerView.layoutManager=layoutManager

    }
}