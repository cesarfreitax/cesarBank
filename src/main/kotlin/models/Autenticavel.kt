package models

interface Autenticavel {
    fun autentica(senha: Int) : Boolean
}