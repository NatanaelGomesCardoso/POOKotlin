package natan.devteste.digionebank

// cria a classe cliente
class Cliente(nome: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun Login(): Boolean = "123456789" == senha // autentica o Login

    override fun toString(): String = """ 
        Nome do Cliente:   $nome 
        Cpf do Cliente:    $cpf
        Tipo do Cliente:   ${clienteTipo.descricao}
        
    """.trimIndent()
}