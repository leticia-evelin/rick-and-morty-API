package br.senai.sp.jandira.rickandmorty.service

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URL_BASE = "https://rickandmortyapi.com/api/"

    //guarda a conexao com o servidor da API
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create()) //criar fabrica de conversao
        .build()

    fun getCharacterService(): CharacterService{
        //retorna a implementacao de uma classe com os metodos para fazer a chamada para API
        return retrofitFactory.create(CharacterService::class.java)
    }

}