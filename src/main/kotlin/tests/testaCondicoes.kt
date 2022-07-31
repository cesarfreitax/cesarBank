fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}