package natan.devteste.digionebank

// cria a classe Pessoa
class Pessoa {
    var nome : String = "Natan"  // objeto nome da Pessoa
    var cpf : String = "235.456.789-45" // objeto cpf da Pessoa
    private set // torna o set privado

    constructor() // chama o construdor secundário

    fun pessoainf() = "$nome e $cpf" // função single-line que retorna o nome e cpf da Pessoa
}

