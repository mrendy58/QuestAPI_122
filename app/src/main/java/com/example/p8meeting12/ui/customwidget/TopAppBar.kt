package com.example.p8meeting12.ui.customwidget

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(
    title: String,
    canNavigateBack: Boolean, // Menentukan apakah ikon navigasi kembali akan ditampilkan.
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null, // Mendukung animasi saat toolbar di-scroll.
    navigateUp: () -> Unit = {}, // Fungsi yang dipanggil saat tombol navigasi kembali ditekan.
    onRefresh: () -> Unit = {} // Fungsi yang dipanggil saat tombol refresh ditekan.
){

}