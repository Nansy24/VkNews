package com.anasteisiamario.vknews.domain.usecase

import com.anasteisiamario.vknews.domain.entity.FeedPost
import com.anasteisiamario.vknews.domain.repository.NewsFeedRepository
import javax.inject.Inject

class ChangeLikeStatusUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}