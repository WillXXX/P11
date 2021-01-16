package com.example.p11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recyclerview_two.*
import kotlinx.android.synthetic.main.activity_screen_one.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        BuscarJson()
    }

    fun BuscarJson() {
        val url = "https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1)."
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                println("Falha ao efetuar requisição")
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)

                val gson = GsonBuilder().create()
                val paginaWeb = gson.fromJson(body, PaginaWeb::class.java)

                runOnUiThread {
                    recyclerView.adapter = Adapter(paginaWeb)
                }
            }

        })

    }
}