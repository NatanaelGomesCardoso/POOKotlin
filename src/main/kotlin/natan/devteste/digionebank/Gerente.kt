package natan.devteste.digionebank

// cria a classe Gerente
class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4 // sobrepõe a função calculoAuxilio passando o retorno dela para o Gerente
    override fun Login(): Boolean = "123456789" == senha // autentica o Login
}