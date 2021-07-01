package natan.devteste.digionebank.testes

import natan.devteste.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}") // Printa o nome e a descricao de cada membro da Enum ClienteTipo
    }

    val pf = ClienteTipo.PF // Cria um objeto e instancia com uma Enum
    println("${pf.name} - ${pf.descricao}") // Printa o nome e a descricao do objeto pf

    val pj = ClienteTipo.PJ // Cria um objeto e instancia com uma Enum
    println("${pj.name} - ${pj.descricao}") // Printa o nome e a descricao do objeto pj
}