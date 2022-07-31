package models

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import java.lang.RuntimeException

abstract class Conta(
    val titular: Cliente,
    val conta: Int,
    var genero: String
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Conta criada!")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun welcome() {
        println("_______________________________")
        println("Nome: ${this.titular.nome}")
        println("Nome: ${this.titular.cpf}")
        println("Conta: ${this.conta}")
        println("Conta: ${this.genero}")
        println("Saldo: ${this.saldo}")
        println("_______________________________")
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(recebedor: Conta, valor: Double, senha: Int) {
        if (valor > this.saldo) {
            throw SaldoInsuficienteException()
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }


        this.saldo -= valor
        recebedor.depositar(valor)

    }

}