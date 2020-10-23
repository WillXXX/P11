package com.example.p11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup

class RecyclerviewTwo : AppCompatActivity() {
    open class AdapterTwo<T> {

        open fun getItemcoun(): Int {}
        open fun onCreateViewhHolder(parent: ViewGroup): GetViewHolder {
            TODO("Not yet implemented")
        }

        open fun onBindViewHolde(holder: GetViewHolder, position: Int) {}
        open fun onBindViewHolder() {}
        open fun onBindViewHolder(holder: GetViewHolder, position: Int) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_two)
    }
}