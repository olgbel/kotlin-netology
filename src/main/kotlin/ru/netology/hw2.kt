fun main(){
    val height = 1.73
    val weight = 53

    val bodyMassIndex: Double = getBodyMassIndex(height, weight)
    val verdict: String = getVerdict(bodyMassIndex)

    println(verdict)
}

fun getBodyMassIndex(height: Double, weight: Int) : Double {
    return (weight.toDouble() / (height * height))
}

fun getVerdict(bodyMassIndex: Double): String {
    return when (bodyMassIndex) {
        in Double.MIN_VALUE..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..24.99 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)\n"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое\n"
        else -> "Очень резкое ожирение"
    }
}