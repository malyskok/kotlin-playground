package org.example.com.kotlinplayground.collections

fun main() {

    val names = listOf("Kamil", "Dilip", "John")
    val filtered = names
        .asSequence()
        .filter { it.length > 4 }
        .map { it.uppercase() }
//        .toList()
    println(filtered)

    val range = 1..1_000_000_000
//    range.map { it.toDouble() }
//        .forEach { println(it) } //Java heap space

    range
        .asSequence()
//        .take(10)
        .map { it.toDouble() }
        .take(10)
        .forEach { println(it) }
}