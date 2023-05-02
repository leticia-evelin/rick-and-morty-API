package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {


    @GET("character") //parametro da url
    //ela sabe chamar os endpoints = devolver uma lista
    fun getCharacters(): Call<CharacterList>

    @GET("character/{id}")
    //trazer um personagem só pelo id
    fun getCharacter(): Call<br.senai.sp.jandira.rickandmorty.model.Character>
}
