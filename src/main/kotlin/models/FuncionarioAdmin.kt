package models

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override val bonificacao: Double
        get() = salario * 0.1

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}