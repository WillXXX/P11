package com.example.p11.Model

data class ModelResponse(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)