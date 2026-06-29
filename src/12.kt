fun readRadius(): Double {
    println("Введите радиус:")
    return readln().toDouble()
}
fun calculateCircleArea(radius: Double): Double {
    return 3.14159 * radius * radius
}
fun printArea(area: Double) {
    println("Площадь круга: $area")
}
fun main() {
    val radius = readRadius()
    val area = calculateCircleArea(radius)
    printArea(area)
}