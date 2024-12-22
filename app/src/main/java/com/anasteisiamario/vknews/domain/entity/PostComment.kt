package com.anasteisiamario.vknews.domain.entity

import com.anasteisiamario.vknews.R

data class PostComment(
    val id: Long,
    val authorName: String,
    val authorAvatarUrl: String,
    val commentText: String,
    val publicationDate: String
)
