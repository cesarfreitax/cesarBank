package tests

import exception.*
import models.*


fun testaCatchException() {
    val contaFran = ContaCorrente(
        titular = Cliente(
            nome = "Fran",
            cpf = "123.456.789-12",
            senha = 123
        ),
        conta = 1000,
        genero = "Feminino"
    )

    val contaCaio = ContaCorrente(
        titular = Cliente(
            nome = "Caio",
            cpf = "234.567.891-23",
            senha = 123
        ),
        conta = 1001,
        genero = "Masculino"
    )

    contaFran.depositar(100.0)
    contaCaio.depositar(100.0)

    try {
        contaFran.transferir(contaCaio, 100.0, 123)
        println("Transferência realizada com sucesso!")
    } catch (e: SaldoInsuficienteException) {
        println("SaldoInsuficienteException foi pega!")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("FalhaAutenticacaoException foi pega!")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    contaFran.welcome()
    contaCaio.welcome()
}