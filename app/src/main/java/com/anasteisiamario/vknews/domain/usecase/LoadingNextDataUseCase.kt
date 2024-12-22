package com.anasteisiamario.vknews.domain.usecase

import com.anasteisiamario.vknews.domain.repository.NewsFeedRepository
import javax.inject.Inject

class LoadingNextDataUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    suspend operator fun invoke() {
        repository.loadNextData()
    }
}