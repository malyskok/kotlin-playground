package org.example.com.kotlinplayground.functions

fun main() {
    val sum = add(2, 3)
    println(sum)

    var sum2 = add2(2, 3)
    println(sum2)

    sum2 = add3(2, 3)
    println(sum2)
}

//fun add(x: Int, y: Int){
fun add(x: Int, y: Int): Unit {
    val sum = x + y
    println("$x + $y = $sum")
}

fun add2(x: Int, y: Int): Int {
    val sum = x + y
    println("$x + $y = $sum")
    return sum
}

fun add3(x: Int, y: Int) = x + y