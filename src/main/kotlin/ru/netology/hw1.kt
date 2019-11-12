fun main(){
    val amount = 200 // стоимость текущей продажи
    val total = 67_000 // сумма предыдущих продаж
//    val fee = calculateFee(amount, total)  // exclusive по умолчанию = false
    val fee = calculateFee(amount, total, false)
    println(fee) // 40
}

//
fun calculateFee(currentAmount: Int, total: Int, isExclusive: Boolean = false): Int{

    var percent = when (total) {
        in 0..1000 -> 30
        in 1001..10_000 -> 25
        in 10_001..50_000 -> 20
        else -> 15
    }

    if (isExclusive)
        percent += 5

    return currentAmount * percent / 100
}