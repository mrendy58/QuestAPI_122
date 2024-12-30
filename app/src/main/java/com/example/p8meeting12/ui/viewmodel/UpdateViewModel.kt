package com.example.p8meeting12.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p8meeting12.model.Mahasiswa
import com.example.p8meeting12.repository.MahasiswaRepository
import kotlinx.coroutines.launch

class UpdateViewModel (
    savedStateHandle: SavedStateHandle,
    private val mhs: MahasiswaRepository
): ViewModel(){
    var updateUiState by mutableStateOf(InsertUiState())
        private set

    private val _nim: String = checkNotNull(savedStateHandle[DestinasiUpdate.NIM])

    init {
        viewModelScope.launch {
            updateUiState = mhs.getMahasiswaById(_nim)
                .toUiStateMhs()
        }
    }

    fun updateInsertMhsState(insertUiEvent: InsertUiEvent){
        updateUiState = InsertUiState(insertUiEvent = insertUiEvent)
    }

    suspend fun updateMhs(){
        viewModelScope.launch {
            try {
                mhs.updateMahasiswa(_nim, updateUiState.insertUiEvent.toMhs())
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}
fun Mahasiswa.toUIStateMhs(): InsertUiState = InsertUiState(
    insertUiEvent = this.toDetailUiEvent(),
)