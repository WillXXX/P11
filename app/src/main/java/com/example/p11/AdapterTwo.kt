package com.example.p11

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_screen_one.view.*
import kotlinx.android.synthetic.main.activity_screen_two.view.*

class AdapterTwo (val paginaWeb: PaginaWeb) : RecyclerView.Adapter<GetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetViewHolder {
         val layoutInflater = LayoutInflater.from(parent.context)
         val cellForRow = layoutInflater.inflate(R.layout.activity_screen_two, parent, false)
         return GetViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: GetViewHolder, position: Int) {
        val items = paginaWeb.items.get(position)
        holder.view.tituloPr.text = items.labels_url
        holder.view.bodyPr.text = items.pulls_url
        holder.view.autor_Name2.text = items.name
        holder.view.nome_Completo2.text = items.full_name


    }

    override fun getItemCount(): Int {
        return paginaWeb.items.count()
    }


}