package models

import models.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Ola! Vc esta no CesarBank")
        } else {
            println("Falha na autenticacao...")
        }
    }

}