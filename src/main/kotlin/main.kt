fun main() {
    val amount = 100.0
    val min_amount = 35.00
    if(amount<min_amount) {
        println("Amount must be more then 35.00 R")
    } else {
        val discount = amount * 0.075
        val price = amount - discount
        println("Amount with discount 0.075%: $price")
    }
}