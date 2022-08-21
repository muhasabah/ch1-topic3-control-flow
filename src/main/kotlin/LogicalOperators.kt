fun main() {
    val a = 10
    val b = 5
    val c = 15
    val flag = false
    var result: Boolean

    result = (a > b) && (a > c)
    println(result)

    result = (a > b) || (a > c)
    println(result)

    result = !flag
    println(result)
}