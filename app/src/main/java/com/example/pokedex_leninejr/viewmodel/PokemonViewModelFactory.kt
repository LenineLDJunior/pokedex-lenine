package com.example.pokedex_leninejr.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class PokemonViewModelFactory : ViewModelProvider.Factory {

    //Não faço ideia porque do erro, era pra funcionar sah merda,
    // tentei ocm o override para o viewmodel factory redefinir uma função herndada mas deu ruim no codigo kkkkkkkkkkkk
    fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PokemonViewModel() as T
    }
}