fun main() {
    print("Masukkan angka : ")
    val angka = readLine()?.toInt()

    if (angka != null) {
        if (isPrime(angka)) {
            println("$angka adalah bilangan prima")
        } else {
            println("$angka bukan bilangan prima")
        }
    } else {
        println("Input tidak valid")
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}
