import models.Cliente
import models.ContaCorrente
import models.ContaPoupanca
import models.Endereco

fun testaComportamentosConta() {
    val contaFran = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "345.678.912-34",
            senha = 231,
            endereco = Endereco(
                logradouro = "Estrada do Pau da Fome",
                numero = 2490,
                complemento = "Depois de Furnas",
                bairro = "Taquara",
                cidade = "Rio de Janeiro"
            )
        ),
        conta = 1000,
        genero = "Feminino"
    )

    println(contaFran.titular.nome)
    println(contaFran.titular.endereco.logradouro)
    println(contaFran.titular.endereco.numero)
    println(contaFran.titular.endereco.complemento)
    println(contaFran.titular.endereco.bairro)
    println(contaFran.titular.endereco.cidade)

}