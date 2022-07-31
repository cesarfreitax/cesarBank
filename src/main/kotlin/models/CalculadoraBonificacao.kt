package models

class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}