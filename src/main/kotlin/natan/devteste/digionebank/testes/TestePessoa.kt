package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Pessoa

fun main(){
    val natan = Pessoa("Natanael","123.456.899-45") // cria a Pessoa natan
    println("${natan.nome} - ${natan.cpf}") // printa as informações da Pessoa nata
}