package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Cliente
import natan.devteste.digionebank.ClienteTipo

fun main() {
    val alex = Cliente(
        nome = "Alexandre Gomes",
        cpf = "123.694.487-46",
        clienteTipo = ClienteTipo.PF,
        senha = "123456789"
    )
    println(alex)
    TesteAutenticacao().autentica(alex)
}
