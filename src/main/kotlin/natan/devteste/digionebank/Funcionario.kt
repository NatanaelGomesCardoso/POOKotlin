package natan.devteste.digionebank

import java.math.BigDecimal

// cria a classe Funcionario
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    // sobrescreve a função toString
    override fun toString(): String = """ 
        Nome do Funcionario: $nome 
        Cpf do Funcionario: $cpf
        Salario do Funcionario: $salario
        Auxilio bonus do Funcionario: ${calculoAuxilio()}
    """.trimIndent()
}