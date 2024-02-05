package org.example.com.kotlinplayground.scopefunctions

import org.example.com.kotlinplayground.classes.Item
import org.example.com.kotlinplayground.classes.Type


fun main() {
    exploreApplyAlso()
//    exploreLet()
//    exploreWith()
//    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1,2,3,4,5)
        numbers?.sum()
    }
    println(result)

    val length = run {
        val name = "Kamil"
        name.length
    }
    println(length)
}

fun exploreWith() {
    val numbers = mutableListOf(1,2,3,4,5)
    val result = with(numbers){
        println(toString())
        sum()
    }
    println(result)
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.filter { it > 2 }
        .let {
            println(it)
            it.sum()
        }
    println(result)

    var name: String? = null
    var resname = name?.let {
        println("name $it")
        it.uppercase()
    }
    name = "Kamil"
    println(resname)
    resname = name?.let {
        println("name2 $it")
        it.uppercase()
    }
    println(resname)
}

fun exploreApplyAlso() {
    val item = Item(
        "burger",
        2.0
    ).apply {
        type = Type.FOOD
//        this.type = Type.FOOD
    }.also {
        it.price += (0..5).random()
        println(it)
    }
}