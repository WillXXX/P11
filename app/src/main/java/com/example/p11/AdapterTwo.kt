package com.example.p11

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_screen_two.view.*


class AdapterTwo (val paginaWeb: PaginaWeb) : RecyclerviewTwo.AdapterTwo<GetViewHolder>(){

    override fun onCreateViewhHolder(parent: ViewGroup): GetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.activity_recyclerview_two, parent, false)
    }

    override fun onBindViewHolder(holder: GetViewHolder,position: Int){
        val items = paginaWeb.items.get(position)
        holder.view.autor_Name2.text = items.name
        holder.view.nome_Completo2.text = items.full_name
    }

    override fun getItemcoun(): Int {
        return paginaWeb.items.count()
    }
}