fun sum(a: Int, b: Int): Int {
    return a + b
}
fun average(a: Int, b: Int): Double {
    return sum(a, b) / 2.0
}
fun main() {
    println(average(8, 14))
}