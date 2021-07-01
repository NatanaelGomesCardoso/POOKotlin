package natan.devteste.digionebank.testes

import natan.devteste.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}