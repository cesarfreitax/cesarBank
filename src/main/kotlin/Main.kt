import models.Endereco

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "teste", complemento = "casa")

    enderecoNulo?.let {
        println(it.logradouro.length)

        val tamanhoComplemento: Int = it.complemento?.length ?: 0
        println(tamanhoComplemento)
    }

}





