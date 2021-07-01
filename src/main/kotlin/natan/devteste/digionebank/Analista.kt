package natan.devteste.digionebank

import java.math.BigDecimal

//cria a classe Analista
class Analista(nome: String,
               cpf: String,
               salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1 // sobrepõe a função calculoAuxilio passando o retorno dela para o Analista

}