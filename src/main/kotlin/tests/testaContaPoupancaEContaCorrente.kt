import models.Cliente
import models.ContaCorrente
import models.ContaPoupanca

fun testaContaPoupancaEContaCorrente() {
    val marcio = ContaPoupanca(
        titular = Cliente(
            nome = "Marcio",
            cpf = "123.456.789-10",
            senha = 123
        ),
        conta = 1000,
        genero = "Masculino"
    )

    val dilma = ContaCorrente(
        titular = Cliente(
            nome = "Dilma",
            cpf = "234.567.891-23",
            senha = 321
        ),
        conta = 1001,
        genero = "Feminino"
    )

    println("______________________________")
    println("Nome: ${marcio.titular.nome}")
    println("models.Conta: ${marcio.conta}")
    println("Saldo: ${marcio.saldo}")
    println("______________________________")

    println("______________________________")
    println("Nome: ${dilma.titular.nome}")
    println("models.Conta: ${dilma.conta}")
    println("Saldo: ${dilma.saldo}")
    println("______________________________")

    println("Saldo apos deposito")
    marcio.depositar(100.0)
    dilma.depositar(100.0)
    println("Saldo: ${marcio.saldo}")
    println("Saldo: ${dilma.saldo}")
    println("______________________________")

    println("Saldo apos saque")
    marcio.sacar(50.0)
    dilma.sacar(50.0)
    println("Saldo: ${marcio.saldo}")
    println("Saldo: ${dilma.saldo}")
}