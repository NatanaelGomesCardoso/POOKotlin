package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Analista
import natan.devteste.digionebank.Funcionario

fun main(){
    val natan = Analista("Natan Gomes", "132.258.897-78", 4000.00) // cria o Funcionario Gerente natan
    imprimeRelatorioFuncionario.imprime(natan) // imprime os dados do Funcionario Analista nivea
}