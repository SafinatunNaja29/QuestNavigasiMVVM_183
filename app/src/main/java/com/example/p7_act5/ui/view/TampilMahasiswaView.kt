package com.example.p7_act5.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.p7_act5.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa, //mengambil data dari model
    onBackklick: () -> Unit

){
    Column(modifier = Modifier.fillMaxSize()) {
        TampilData(
            judul = "Nama",
            isi = mhs.nama
        )
        TampilData(
            judul = "NIM",
            isi = mhs.nim
        )
        TampilData(
            judul = "Jenis Kelamin",
            isi = mhs.gender
        )
        TampilData(
            judul = "Email",
            isi = mhs.email
        )
        TampilData(
            judul = "No. HP",
            isi = mhs.noHp
        )
        TampilData(
            judul = "Alamat",
            isi = mhs.alamat
        )

        Button(
            onClick = onBackklick,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text("Kembali")
        }
    }
}

@Composable
fun TampilData(
    judul : String,
    isi : String
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isi, modifier = Modifier.weight(2f))
    }
}