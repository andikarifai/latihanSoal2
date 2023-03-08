fun main() {
    print("Masukkan angka pertama : ")
    val angka1 = readLine()?.toDouble()

    print("Masukkan angka kedua : ")
    val angka2 = readLine()?.toDouble()

    if (angka1 != null && angka2 != null) {
        print("Operasi : ")
        val operator = readLine()

        val hasil = when (operator) {
            "tambah" -> angka1 + angka2
            "kurang" -> angka1 - angka2
            "bagi" -> angka1 / angka2
            "kali" -> angka1 * angka2
            else -> null
        }

        if (hasil != null) {
            println("Hasil : $angka1 $operator $angka2 = $hasil")
        } else {
            println("Operasi tidak valid")
        }
    } else {
        println("Input tidak valid")
    }
}
