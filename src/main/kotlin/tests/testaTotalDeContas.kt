package tests

import models.Cliente
import models.Conta
import models.ContaCorrente
import models.ContaPoupanca

fun testaTotalDeContas() {
    val cesar = ContaCorrente(
        titular = Cliente(
            nome = "Cesar",
            cpf = "167.127.607-80",
            senha = 123
        ),
        conta = 1000,
        genero = "Masculino"
    )

    val rafaella = ContaPoupanca(
        titular = Cliente(
            nome = "Rafaella",
            cpf = "234.567.891-23",
            senha = 321
        ),
        conta = 1001,
        genero = "Feminino"
    )

    val andrea = ContaCorrente(
        titular = Cliente(
            nome = "Andrea",
            cpf = "345.678.912-34",
            senha = 213
        ),
        conta = 1002,
        genero = "Feminino"
    )

    cesar.welcome()
    rafaella.welcome()
    andrea.welcome()

    print("Total de contas: ${Conta.total}")
}