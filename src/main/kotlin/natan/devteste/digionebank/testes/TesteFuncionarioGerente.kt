package natan.devteste.digionebank.testes


import natan.devteste.digionebank.Gerente

fun main(){
    val natan = Gerente("Natan Gomes", "132.258.897-78", 4000.00, "123456789") // cria o Funcionario Gerente natan
    imprimeRelatorioFuncionario.imprime(natan) // imprime os dados do Funcionario Analista nivea

    TesteAutenticacao().autentica(natan)
}