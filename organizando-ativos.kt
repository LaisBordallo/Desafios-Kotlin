fun main() {
    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = readLine()!!.toInt()

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = readLine()!!
        ativos.add(codigoAtivo)
    }

    // Ordenar os ativos em ordem alfabética.
    ativos.sort()

    // Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (ativo in ativos) {
        println(ativo)
    }
}
