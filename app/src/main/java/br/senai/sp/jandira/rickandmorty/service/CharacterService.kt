package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {


    @GET("character") //parametro da url
    //ela sabe chamar os endpoints = devolver uma lista
    fun getCharacters(): Call<CharacterList>

    @GET("character/{id}")
    //trazer um personagem só pelo id
    // argumento(pode ser qualquer nome) que for passado vai ser ser colocado no id do Path
    fun getCharacter(@Path("id") id: Int): Call<br.senai.sp.jandira.rickandmorty.model.Character>

    @GET("character/") //queryString
    //"page" é da url, nao pode ser diferente
    fun getCharactersByPage(@Query("page") page: Int): Call<CharacterList>

}
