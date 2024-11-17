package com.example.p7_act5.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.p7_act5.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel:ViewModel() { //bentuk view modelnya
    private val _uiState = MutableStateFlow(Mahasiswa()) //private variable
    val uistate:StateFlow<Mahasiswa> = _uiState.asStateFlow()

    //membuat fungsi baru
    fun saveDataMahasiswa( //membuat parameter karena
        ls : MutableList<String>  //nama list nya yaitu ls
    ) {
        _uiState.update { data -> //data nya berisi 'Mahasiswa'
            data.copy(
                nama = ls[0], //data yang dicopy akan urut sesuai nomer yang diberikan
                gender = ls [1],
                alamat = ls[2]


            )
        }
    }
}