package natan.devteste.digionebank

// cria a classe Gerente
class Gerente(nome: String,
              cpf: String,
              salario: Double
) : Funcionario(nome, cpf, salario){
    override fun calculoAuxilio(): Double = salario * 0.4 // sobrepõe a função calculoAuxilio passando o retorno dela para o Gerente

}