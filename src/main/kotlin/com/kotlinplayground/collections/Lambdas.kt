package org.example.com.kotlinplayground.collections

fun main() {
    val addx = { x: Int -> x + x }
    println(addx(1))

    val addxy = { x: Int, y: Int -> x + y }
    println(addxy(1, 2))

    val addxy2 = { x: Int, y: Int ->
        println("addxy")
        x + y
    }
    println(addxy2(1, 2))

    println(calculate(1, 1, { a, b -> a + b })) //Lambda argument should be moved out of parentheses
    println(calculate(1, 1) { a, b -> a + b })
    println(calculate(2, 4) { x, y -> x * y })
}

//Higher order function
fun calculate(x: Int, y: Int, operation: (a: Int, b: Int) -> Int): Int {
    return operation(x, y)
}