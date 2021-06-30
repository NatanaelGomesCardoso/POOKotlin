package natan.devteste.digionebank

class Pessoa(nome:String , cpf:String) {
    var nomep : String = nome
    var cpfp : String = cpf
    private set
}

fun main(){
    val natan = Pessoa("Natan" ,"072.5698.123-55")
    println(natan.nomep)
    println(natan.cpfp)
}