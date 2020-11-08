package com.example.instagram.ui.models

data class Comment(
    val user: User,
    val text: String,
    val likes: Int
)