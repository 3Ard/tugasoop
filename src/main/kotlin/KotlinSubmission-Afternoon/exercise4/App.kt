package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
        var numerator: Int
        var denominator: Int

        try {
            // Blok try: mencoba membaca numerator
            print("Masukkan numerator: ")
            numerator = readLine()?.toInt() ?: 0

            // Blok try: mencoba membaca denominator
            print("Masukkan denominator: ")
            denominator = readLine()?.toInt() ?: 1

            // Blok try: mencoba melakukan pembagian
            val result = numerator / denominator
            println("Hasil pembagian: $result")

        } catch (e: NumberFormatException) {
            // Blok catch: menangkap exception jika terjadi NumberFormatException
            println("Maaf, input yang Anda masukkan bukan angka.")
        } catch (e: ArithmeticException) {
            // Blok catch: menangkap exception jika terjadi ArithmeticException (pembagian oleh nol)
            println("Maaf, terjadi pembagian oleh nol.")
        }
    }
