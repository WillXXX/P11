package com.example.p11

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.p11.Model.ModelResponse
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_screen_one.view.*
import kotlinx.android.synthetic.main.activity_screen_two.view.autor_Name2
import kotlinx.android.synthetic.main.activity_screen_two.view.nome_Completo2
import kotlinx.android.synthetic.main.activity_screen_two.view.tituloPr

class Adapter(val paginaWeb: ModelResponse) : RecyclerView.Adapter<GetViewHolder>() {

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
        holder.view.nomeReposit.text = items.owner.login
        holder.view.deskReposit.text = items.description
        holder.view.autor_Name.text = items.name
        holder.view.nome_Completo.text = items.full_name


        holder.view.autor_Name2.text = items.name
        holder.view.nome_Completo2.text = items.full_name
        holder.view.tituloPr.text = items.pulls_url

        holder.view.f_Count.text = items.forks_count.toString()

//button_imageAvatar + picasso
        val ownerProfileImageButton = holder.view.button_imageAvatar
        Picasso.get().load(items.owner.avatar_url).into(ownerProfileImageButton)
        holder.view.starCount.text = items.stargazers_count.toString()
    }


}

//A instrução para chama segunda Activity tem que ficar dentro do recyclerview, Pegando dados no Intent()
class GetViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    init{
        view.setOnClickListener {
            val intent = Intent(view.context, ScreenTwo::class.java)
            view.context.startActivity(intent)
        }
    }

}

