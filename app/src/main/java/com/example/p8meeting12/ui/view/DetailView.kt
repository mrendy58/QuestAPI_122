package com.example.p8meeting12.ui.view

import com.example.p8meeting12.ui.navigation.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail"
    const val NIM = "nim"
    override val titleRes = "Detail Mahasiswa"
    val routeWithArg = "$route/{$NIM}"
}