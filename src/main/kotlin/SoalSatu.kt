fun main() {
    println("=== Kalkulator BMI ===")
    print("Masukkan Berat Badan (kg) : ")
    val berat = readLine()?.toDoubleOrNull()
    if (berat == null || berat <= 0) {
        println("Masukkan berat badan yang valid!")
        return
    }

    print("Masukkan Tinggi Badan (cm) : ")
    val tinggi = readLine()?.toDoubleOrNull()
    if (tinggi == null || tinggi <= 0) {
        println("Masukkan tinggi badan yang valid!")
        return
    }

    val tinggiM = tinggi / 100 // konversi tinggi ke meter
    val bmi = berat / (tinggiM * tinggiM)

    val status = when {
        bmi < 17 -> "Kurus"
        bmi < 18.5 -> "Kurus"
        bmi < 25 -> "Normal"
        bmi < 27 -> "Gemuk"
        else -> "Gemuk"
    }

    println("Hasil BMI : $status")
}
