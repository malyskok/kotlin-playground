package org.example.com.kotlinplayground

fun main() {
    var name = "Kamil"
    name = "Kamila"

    val bool = if (name.length == 5) {
        println(name.length)
        true
    } else {
        println(name.length)
        false
    }
    println(bool)

    var place = 1
    var medal = if (place == 1) {
        "gold"
    } else if (place == 2) {
        "silver"
    } else if (place == 3) {
        "bronze"
    } else {
        "sad"
    }
    println(medal)

    place = 2
    medal = when (place) {
        1 -> {
            "gold"
        }
        2 -> {
            "silver"
        }
        3 -> {
            "bronze"
        }
        else -> {
            "sad"
        }
    }
    println(medal)

    place = 3
    medal = when (place) {
        1 -> "gold"
        2 -> "silver"
        3 -> "bronze"
        else -> "sad"
    }
    println("result: $medal")
}