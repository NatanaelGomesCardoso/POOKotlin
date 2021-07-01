package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Funcionario
import natan.devteste.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val natan = Pessoa("Natanael","123.456.899-45") // cria a Pessoa natan
    println("Nome da pessoa: ${natan.nome}\nCpf da pessoa: ${natan.cpf}\n") // printa as informações da Pessoa natan

    val nivea = Funcionario("Nivea Karolly", "123.456.897-78", BigDecimal.valueOf(2000.00)) // cria o funcionario nivea
    println("Nome do funcionário: ${nivea.nome}\nCpf do funcionário: ${nivea.cpf}\nSalário do funcionário: R$${nivea.salario}") // printa as informações do Funcionario nivea

}