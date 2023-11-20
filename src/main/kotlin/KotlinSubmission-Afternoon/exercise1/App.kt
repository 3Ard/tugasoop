package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Resta"
    val lastName: String = "Amalia"
    val age: Int = 21
    val isSingle: Boolean = true

    // Menampilkan nilai
    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }

    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    // Buat variabel yang berisi daftar anggota grup
    val groupMembers = listOf("Angel", "Dhea", "Resta", "Luvy", "Awaludin", "Nayandra", "Abdul", "Arya", "Ibdu", "Iqbal", "Rifky")

    // Akses item yang berisi nama Anda
    val myName = groupMembers[2]

    // Cetak nama Anda
    println("Resta: $myName")

    // Jadikan nilai kembalian
    return groupMembers

    return listOf()
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember():  Int {
    val mentor = arrayOf("Ka Hasan", "Ka Malik", "Ka Raynaldi") // Ganti dengan nama mentor sesuai kebutuhan
    val countOfGroup = arrayOf("Angel", "Dhea", "Resta", "Luvy", "Awaludin", "Nayandra", "Abdul", "Arya", "Ibdu", "Iqbal", "Rifky") // Ganti dengan nama anggota grup sesuai kebutuhan

    val total = mentor.size + countOfGroup.size

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val groupId = "Mobile A"
    val members = listOf("Angel", "Dhea", "Resta", "Luvy", "Awaludin", "Nayandra", "Abdul", "Arya", "Ibdu", "Iqbal", "Rifky")
    val session = "Afternoon Session"

    groupDetail(groupId, members, session)
}