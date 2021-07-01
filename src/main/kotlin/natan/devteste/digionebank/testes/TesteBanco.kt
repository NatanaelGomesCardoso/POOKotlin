package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Banco

fun main(){
    val natanOneBank = Banco(nome = "NatanBank", numero = 13) // cria um Banco com nome e numero
    print(natanOneBank.nome + " - ")  // printa o nome do banco
    println(natanOneBank.numero)    // printa o numero do banco

    val niveaOneBank = natanOneBank.copy(nome = "NiveaBank") // cria uma cópia do Banco natanOneBank com outro nome mas mesmo numero

    print(niveaOneBank.info()) // printa o numero e nome do Banco usando uma função single-line

}