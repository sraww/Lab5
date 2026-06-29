fun main() {
    // Запрос цены без налога
    println("Введите цену без налога:")
    val priceInput = readLine()
    val price = priceInput?.toDoubleOrNull() ?: run {
        println("Некорректный ввод цены.")
        return
    }

    // Запрос налоговой ставки
    println("Введите налоговую ставку (%):")
    val taxRateInput = readLine()
    val taxRate = taxRateInput?.toDoubleOrNull() ?: run {
        println("Некорректный ввод налоговой ставки.")
        return
    }

    // Вычисляем сумму налога
    val taxAmount = calculateTax(price, taxRate)

    // Вычисляем итоговую стоимость
    val totalPrice = calculateTotalPrice(price, taxAmount)

    // Вывод результатов
    println("Сумма налога: %.2f".format(taxAmount))
    println("Итоговая цена с налогом: %.2f".format(totalPrice))
}

// Функция для вычисления суммы налога
fun calculateTax(price: Double, taxRate: Double): Double {
    return price * (taxRate / 100)
}

// Функция для вычисления итоговой стоимости товара
fun calculateTotalPrice(price: Double, taxAmount: Double): Double {
    return price + taxAmount
}