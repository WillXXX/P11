package com.example.p11

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView


class AdapterTwo (val paginaWeb: PaginaWeb) : RecyclerviewTwo.AdapterTwo<GetViewHolder>(){

    override fun onBindViewHolder(holder: GetViewHolder,position: Int){
        val items = paginaWeb.items.get(position)
    }

}