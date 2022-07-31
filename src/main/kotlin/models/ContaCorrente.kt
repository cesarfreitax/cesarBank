package models

class ContaCorrente(
    titular: Cliente,
    conta: Int,
    genero: String
) : Conta(
    titular = titular,
    conta = conta,
    genero = genero
) {
    override fun sacar(valor: Double) {
        val saqueComTaxa = valor + (valor * 0.02)
        if(this.saldo >= saqueComTaxa){
            this.saldo -= saqueComTaxa
        }
    }
}