package com.anasteisiamario.vknews.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anasteisiamario.vknews.domain.usecase.CheckAuthStateUseCase
import com.anasteisiamario.vknews.domain.usecase.GetAuthStateFlowUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getAuthStateFlowUseCase: GetAuthStateFlowUseCase,
    private val checkAuthStateUseCase: CheckAuthStateUseCase
): ViewModel() {

    val authState = getAuthStateFlowUseCase()

    fun performAuthResult() {
       viewModelScope.launch {
           checkAuthStateUseCase()
       }
    }
}