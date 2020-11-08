package com.example.instagram.ui.models

import java.time.LocalDateTime

data class Post(
    val id: Int? = null,
    val user: User?,
    val geo: String,
    val imageUrl: String,
    val likes: Int,
    val comments: List<Comment>?,
    val createdDate: LocalDateTime?

)