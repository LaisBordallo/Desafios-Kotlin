fun main() {
  // Entrada de dados
  val saldoTotal = readLine()!!.toInt()
  val valorSaque = readLine()!!.toInt()

  //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
 if (valorSaque > saldoTotal) {
        println("Saldo insuficiente. Saque nao realizado!")
  } else {
        // Calcula o saldo disponível e envia para a saída de dados.
        val novoSaldo = saldoTotal - valorSaque
        println("Saque realizado com sucesso. Novo saldo: $novoSaldo")
    }
}
