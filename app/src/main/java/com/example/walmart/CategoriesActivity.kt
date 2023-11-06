package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class CategoriesActivity : AppCompatActivity() {
    private lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.categories_page)
        view = findViewById(R.id.view)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have chosen the Mobile category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
        view = findViewById(R.id.view2)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have Computer the Clothing category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
        view = findViewById(R.id.view3)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have chosen the Electronic category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
        view = findViewById(R.id.view4)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have chosen the Grocery category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
        view = findViewById(R.id.view5)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have chosen the Sports category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
        view = findViewById(R.id.view6)
        view.setOnClickListener {
            android.widget.Toast.makeText(this, "You have chosen the Clothing category of shopping”", android.widget.Toast.LENGTH_LONG).show()
        }
    }
}