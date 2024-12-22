package com.anasteisiamario.vknews.domain.repository

import com.anasteisiamario.vknews.domain.entity.FeedPost
import com.anasteisiamario.vknews.domain.entity.PostComment
import com.anasteisiamario.vknews.domain.entity.AuthState
import kotlinx.coroutines.flow.StateFlow

interface NewsFeedRepository {

    fun getAuthStateFlow(): StateFlow<AuthState>

    fun getRecommendations(): StateFlow<List<FeedPost>>

    fun getComments(feedPost: FeedPost): StateFlow<List<PostComment>>

    suspend fun loadNextData()

    suspend fun checkAuthState()

    suspend fun deletePost(feedPost: FeedPost)

    suspend fun changeLikeStatus(feedPost: FeedPost)
}