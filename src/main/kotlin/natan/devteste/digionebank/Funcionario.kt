package natan.devteste.digionebank

import java.math.BigDecimal

// cria a classe Funcionario
abstract class Funcionario(
    nome: String, // cria o objeto aberto natan
    cpf: String,  // cria o objeto aberto cpf
    val salario: Double    // cria o obejto salario
): Pessoa(nome, cpf) {         // construtor primario da classe Pessoa
    protected abstract fun calculoAuxilio(): Double

    // sobrescreve a função toString
    override fun toString(): String = """ 
        Nome do Funcionario: $nome 
        Cpf do Funcionario: $cpf
        Salario do Funcionario: $salario
        Auxilio bonus do Funcionario: ${calculoAuxilio()}
    """.trimIndent()
}