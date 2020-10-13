package com.example.p11

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_screen_one.view.*

class Adapter(val paginaWeb: PaginaWeb) : RecyclerView.Adapter<GetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.activity_screen_one, parent,false)
        return GetViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return paginaWeb.items.count()
    }

    //fazendo ligações entre screenOne e MainAdapter
    override fun onBindViewHolder(holder: GetViewHolder, position: Int) {
        val items = paginaWeb.items.get(position)
        holder.view.nomeReposit.text = items.id.toString()
        holder.view.descReposit.text = items.node_id
        holder.view.autor_Name.text = items.name
        holder.view.nome_Completo.text = items.full_name
        holder.view.f_Count.text = items.forks_count.toString()
        holder.view.starCount.text = items.owner.stargazers_count.toString()

        val ownerProfileImageButton = holder.view.button_imageAvatar
        Picasso.get().load(items.owner.avatar_url).into(ownerProfileImageButton)
    }

}

class GetViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    init{
        view.setOnClickListener {
            val intent = Intent(view.context, MainActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}