package com.canbazdev.databindingmedium

import android.text.Editable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/*
*   Created by hamzacanbaz on 4.07.2022
*/
class HomeViewModel : ViewModel() {
    private var _name = MutableStateFlow("Vera")
    val name: StateFlow<String> = _name

    private var _lastName = MutableStateFlow("Pollux")
    val lastName: StateFlow<String> = _lastName

    private var _photo = MutableStateFlow(R.drawable.bob)
    val photo: StateFlow<Int> = _photo

    fun reverseName() {
        _name.value = name.value.reversed()
    }

    fun updateName(s: Editable) {
        _name.value = s.toString()
    }
}