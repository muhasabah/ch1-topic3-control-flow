fun main() {
    val nilai = 50
    if(nilai > 50){
        println("Lulus")
    }else{
        println("Tidak Lulus")
    }

    //--------------------------------------------------------
    val nilai2 = 10
    if (nilai2 > 0){
        println("Angka positif")
    } else if (nilai2 < 0){
        println("Angka negatif")
    } else{
        println("Agkanya 0")
    }

    //--------------------------------------------------------
    val angka1 = 25
    val angka2 = 20
    val angka3 = 30
    val hasil = if (angka1 > angka2){
        val max = if (angka1 > angka3){
            angka1
        }else{
            angka3
        }
        "body of if $max"
    } else if (angka2 > angka3){
        "body of else if $angka2"
    } else{
        "body of else $angka3"
    }
    println(hasil)
}