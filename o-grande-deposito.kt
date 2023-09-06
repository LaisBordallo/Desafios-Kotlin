import java.util.Scanner

fun main() {
  val scanner = Scanner(System.`in`)
  val valor = scanner.nextDouble()

  if (valor > 0) {
    println("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f".format(valor))
  } else if (valor < 0.0) {
    println("Valor invalido! Digite um valor maior que zero.")
  } else {
    println("Encerrando o programa...")
  }
}
