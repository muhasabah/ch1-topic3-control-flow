fun main() {
    val namaSaya = nama()
    println("Nama : $namaSaya")
    pertama()
    kedua()
}

private fun nama(): String{
    return "Ahmad Ali\n"
}

//-------------------------------------------------------------
fun pertama(){
    listOf(100, 200, 300, 400, 500).forEach tahan@{
        if (it == 400) return@tahan
        println(it)
    }
    println("Selesai menggunakan eksplisit\n")
}

//-------------------------------------------------------------
fun kedua(){
    listOf(1, 2, 3, 4, 5).forEach(
        fun (value:Int){
            if (value == 3) return
            print(value)
        }
    )
    println("\nSelesai menggunakan dengan fungsi anonim")
}

