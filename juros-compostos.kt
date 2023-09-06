import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val df = DecimalFormat("#.00")

    val valorInicial = scanner.nextDouble()
    val taxaJuros = scanner.nextDouble()
    val periodo = scanner.nextInt()

    var valorFinal = valorInicial

    for (i in 1..periodo) {
        valorFinal += valorFinal * taxaJuros
    }

    println("Valor final do investimento: R$ ${df.format(valorFinal)}")

    scanner.close()
}
