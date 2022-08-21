fun main() {
    for (i in 1 .. 3){
        println("Nilai : $i")
    }

    //--------------------------------------------------------------------
    val mList = listOf("Halo ", "Saya Akan ", "Menjadi Android Developer")
    for (i in mList){
        print(i)
    }
    println()

    //--------------------------------------------------------------------
    for (j in mList.indices){
        println("Index: $j")
    }

    //--------------------------------------------------------------------
    for ((index, values) in mList.withIndex()){
        println("Index: $index, value: $values")
    }

    //--------------------------------------------------------------------
    mList.forEach{
        print(it)
    }
    println()
    val angka = 10 downTo 0 step 2
    angka.forEach { println(it) }
}