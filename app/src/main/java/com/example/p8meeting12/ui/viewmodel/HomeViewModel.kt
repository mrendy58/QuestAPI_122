package com.example.p8meeting12.ui.viewmodel

import com.example.p8meeting12.model.Mahasiswa

sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>): HomeUiState()
    object Error: HomeUiState()
    object Loading: HomeUiState()
}