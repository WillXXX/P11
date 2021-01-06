package com.example.p11

class PaginaWeb(val items: List<Items>)

class Items(val name: String,
            val full_name: String,
            val forks_count: Int,
            val id: Int,
            val html_url: String,
            val stargazers_count: Int,
            val description: String,

            val labels_url: String,
            val pulls_url: String,

//outra classe dentro de itens - Owner
            val owner: Owner)

class Owner(val avatar_url: String,
            val login: String)
