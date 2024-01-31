package org.example.com.kotlinplayground

fun main() {
    var range = 1..10
    println(range)
    for (i in range) {
        println(i)
    }

    //var reverseRange = 10..1 //This range is empty. Did you mean to use 'downTo'?
    val reverseRange = 10 downTo 1
    println(reverseRange)
    for (i in reverseRange) {
        println(i)
    }

    for (i in range step 2) {
        print(i)
    }

    println()
    exploreWhile()
}

fun exploreWhile() {
    println("while")
    var i = 0
    while (i < 5) {
        println(i++)
    }

    println("dowhile")
    var i2 = 0
    do {
        println(++i2)
    } while (i2 < 5)
}
