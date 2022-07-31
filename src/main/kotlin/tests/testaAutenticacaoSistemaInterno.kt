import models.Cliente
import models.Diretor
import models.Gerente
import models.SistemaInterno

fun testaAutenticacaoSistemaInterno() {
    val diretora = Diretor(
        nome = "Rafaella",
        cpf = "123.456.789.10",
        salario = 2000.0,
        senha = 200,
        plr = 1000.0
    )

    val gerente = Gerente(
        nome = "Caio",
        cpf = "234.567.891.23",
        salario = 3000.0,
        senha = 300
    )

    val cliente = Cliente(
        nome = "Rebeca",
        cpf = "345.678.912.34",
        senha = 1111
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(diretora, 200)
    sistemaInterno.entra(gerente, 300)
    sistemaInterno.entra(cliente, 1111)
}