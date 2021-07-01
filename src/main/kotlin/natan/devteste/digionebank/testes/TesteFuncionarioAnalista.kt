package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Analista

fun main(){
    val nivea = Analista("Nivea Karolly", "123.456.897-78", 2000.00) // cria o Funcionario Analista nivea
    println("Nome do funcionário: ${nivea.nome}\nCpf do funcionário: ${nivea.cpf}\nSalário do funcionário: R$${nivea.salario}") // printa as informações do Funcionario nivea

    imprimeRelatorioFuncionario.imprime(nivea) // imprime os dados do Funcionario Analista nivea
}
