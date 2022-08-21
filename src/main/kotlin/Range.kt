fun main() {
    val mRange = 0..10 step 2
    println(mRange)
    //--------------------------------------------------------
    val mRangeDua = 0.rangeTo(10) step 2
    println(mRangeDua)
    //--------------------------------------------------------
    val mRangeTiga = 10.downTo(0) step 5
    println(mRangeTiga)
    //--------------------------------------------------------
    val mRangeEmpat = 0 until 5 step 2
    println(mRangeEmpat)

    //--------------------------------------------------------
    //kombinasi range dan when
    val nilai=71
    when(nilai){
        in 0..50-> println("Nilai kamu F")
        in 51..60-> println("Nilai kamu E")
        in 61..70-> println("Nilai kamu D")
        in 71..80-> println("Nilai kamu C")
        in 81..90-> println("Nilai kamu B")
        in 91..100-> println("Nilai kamu A")
        else-> println("Masuk remedial")
    }
    //-------------------------------------------------------
    val keterangan = when (nilai){
        in 100.downTo(90)-> "Nilai A"
        in 89 downTo 80-> "Nilai A-"
        in 79 downTo 75-> "Nilai B+"
        in 74.downTo(70)-> "Nilai B"
        in 69 downTo 65-> "Nilai B-"
        in 64 downTo 60-> "Nilai C"
        in 59 downTo 50-> "Nilai D"
        in 49 downTo 0-> "Nilai E"
        else-> "Belum input nilai"
    }
    println(keterangan)
}