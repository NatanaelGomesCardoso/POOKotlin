package natan.devteste.digionebank

// cria a classe Banco
data class Banco(
    val nome: String, // objeto nome do Banco
    val numero: Int // objeto numero do Banco
) {
    fun info() = "Nome do banco: $nome - Número do banco: $numero" // função single-line de retorno de informações: nome e numero
}
