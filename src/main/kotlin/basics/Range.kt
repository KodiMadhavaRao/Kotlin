package basics

fun main() {
    val rangeCheck=5
    println(rangeCheck in 1..5)//upper bound included
    println(rangeCheck in 1 until 5)//upper bound excluded

}