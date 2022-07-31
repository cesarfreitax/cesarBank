import models.Analista
import models.CalculadoraBonificacao
import models.Diretor
import models.Gerente

fun testaFuncionarios() {
    val andrea = Analista(
        nome = "Andrea",
        cpf = "234.567.891.23",
        salario = 4000.0,
    )

    val caio = Gerente(
        nome = "Caio",
        cpf = "345.678.912.34",
        salario = 6000.0,
        senha = 123
    )

    val rafaella = Diretor(
        nome = "Rafaella",
        cpf = "456.789.123.45",
        salario = 8000.0,
        senha = 290521,
        plr = 1000.0
    )

    val paulo = Analista(
        nome = "Paulo",
        cpf = "567.891.234.56",
        salario = 5000.0
    )

    println("___________________________")
    println("Nome: ${andrea.nome}")
    println("CPF: ${andrea.cpf}")
    println("Salario: ${andrea.salario}")
    println("Bonificacao: ${andrea.bonificacao}")
    println("___________________________")

    println("___________________________")
    println("Nome: ${caio.nome}")
    println("CPF: ${caio.cpf}")
    println("Salario: ${caio.salario}")
    println("Bonificacao: ${caio.bonificacao}")
    if (caio.autentica(1234)) {
        println("Autenticou!")
    } else {
        println("Falhou")
    }
    println("___________________________")

    println("___________________________")
    println("Nome: ${rafaella.nome}")
    println("CPF: ${rafaella.cpf}")
    println("Salario: ${rafaella.salario}")
    println("Bonificacao: ${rafaella.bonificacao}")
    println("PLR: ${rafaella.plr}")
    if (rafaella.autentica(290521)) {
        println("Autenticou!")
    } else {
        println("Falhou")
    }
    println("___________________________")

    println("___________________________")
    println("Nome: ${paulo.nome}")
    println("CPF: ${paulo.cpf}")
    println("Salario: ${paulo.salario}")
    println("Bonificacao: ${paulo.bonificacao}")
    println("___________________________")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(andrea)
    calculadora.registra(caio)
    calculadora.registra(rafaella)
    calculadora.registra(paulo)

    println("Total de bonificacao: ${calculadora.total}")
}