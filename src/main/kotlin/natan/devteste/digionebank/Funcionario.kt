package natan.devteste.digionebank

import java.math.BigDecimal

// cria a classe Funcionario
class Funcionario(
    override val nome: String, // cria o objeto aberto natan
    override val cpf: String,  // cria o objeto aberto cpf
    val salario: BigDecimal    // cria o obejto salario
): Pessoa(nome, cpf) {         // construtor primario da classe Pessoa

}