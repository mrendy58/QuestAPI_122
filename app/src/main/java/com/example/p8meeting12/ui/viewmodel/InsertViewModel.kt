package com.example.p8meeting12.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p8meeting12.model.Mahasiswa
import com.example.p8meeting12.repository.MahasiswaRepository
import kotlinx.coroutines.launch

class InsertViewModel(private val mhs: MahasiswaRepository): ViewModel() {
    var uiState by mutableStateOf(InsertUiEvent())
        private set
    fun updateInsertMhsState(insertUiEvent.InsertUiEvent) {
        uiState = InsertUiEvent(insertUiEvent = InsertUiEvent)
    }
    suspend fun insertMhs() {
        viewModelScope.launch {
            try {
                mhs.insertMahasiswa(uiState.insertUiEvent.toMhs())
            }catch (e:Exception) {
                e.printStackTrace()
            }
        }
    }
}

fun Mahasiswa.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jenisKelamin = jenisKelamin,
    kelas = kelas,
    angkatan = angkatan
)