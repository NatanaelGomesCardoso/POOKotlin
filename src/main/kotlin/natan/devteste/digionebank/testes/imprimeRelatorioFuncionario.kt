package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Funcionario

// cria a classe imprimeRelatorioFuncionario
class imprimeRelatorioFuncionario {
    companion object { // obejto companheiro
        fun imprime(funcionario: Funcionario){ // função que imprime os dados dos Funcionarios
            println(
                funcionario.toString()
            )
        }
    }
}