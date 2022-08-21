fun main() {
    val number = 4
    val hasil = when(number){
        1->"Setunggal"
        2->"Kalih"
        3->"Tigo"
        else->"Nomor tidak valid"
    }
    println(hasil)

    //---------------------------------------------------------
    val tipeData: Any = 10.0f
    when(tipeData){
        is Float-> println("Float")
        is String-> println("String")
        else-> println("Else")
    }

    //---------------------------------------------------------
    val nama = "Aghni"
    when(nama){
        "Aghni"-> println("Namanya adalah $nama")
        else-> println("Namanya tdak dikenali")
    }
}