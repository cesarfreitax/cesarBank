package exception

import java.lang.Exception

class SaldoInsuficienteException(mensagem: String = "Saldo insuficiente!") : Exception(mensagem)