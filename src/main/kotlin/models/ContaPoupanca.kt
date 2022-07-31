package models

class ContaPoupanca(
    titular: Cliente,
    conta: Int,
    genero: String
) : Conta(
    titular = titular,
    conta = conta,
    genero = genero
) {
    override fun sacar(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

}