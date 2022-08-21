fun main() {
    var i = 1
    while (i < 5){
        println(i)
        i++
        if (i == 4){
            break
        }
    }
    println("Perulangan berhenti di $i \n")

    //------------------------------------------------------------------
    var b = 5
    while (b > 1){
        println(b)
        b--
        if (b == 2){
            break
        }
    }
    println("Perulangan berhenti di $b")
}