package com.anasteisiamario.vknews.presentation.comments

import com.anasteisiamario.vknews.domain.entity.FeedPost
import com.anasteisiamario.vknews.domain.entity.PostComment

sealed class CommentsScreenState {

    object Initial: CommentsScreenState()

    data class Comments(
        val comments: List<PostComment>,
        val feedPost: FeedPost
    ): CommentsScreenState()

}