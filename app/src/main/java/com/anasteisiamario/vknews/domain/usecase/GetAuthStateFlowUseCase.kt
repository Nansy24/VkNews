package com.anasteisiamario.vknews.domain.usecase

import com.anasteisiamario.vknews.domain.entity.AuthState
import com.anasteisiamario.vknews.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetAuthStateFlowUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {

    operator fun invoke(): StateFlow<AuthState> {
        return repository.getAuthStateFlow()
    }
}