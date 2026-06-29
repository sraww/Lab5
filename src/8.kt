fun printDiscount(price: Double, discountPercent: Double = 5.0) {
    val discount = price * discountPercent / 100
    println("Скидка: $discount")
}
fun main() {
    printDiscount(1500.0)
    printDiscount(1500.0, 10.0)
}