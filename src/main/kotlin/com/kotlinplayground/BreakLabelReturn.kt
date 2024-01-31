package org.example.com.kotlinplayground

fun main() {
    fun1()
    fun2()
    fun3()
    fun4()

    println("list")
    listOf(1,2,3).forEach { println(it)
        if(it==2) return}
}

fun fun1() {
    println("fun1")
    for (i in 1..5){
        println(i)
        if(i == 3)
            break
    }
    println("END")
}

fun fun2() {
    println("fun2")
    for (i in 1..5){
        println(i)
        if(i == 3)
            return
    }
    println("END")
}

fun fun3() {
    println("fun3")
    loop@for (i in 1..5){
        println(i)
        if(i == 3)
            break@loop
    }
    println("END")
}

fun fun4() {
    println("fun4")
    loop@for (i in 1..5){
        println("i: $i")
        innerloop@for(j in 1..5){
            println("j: $j")
            if (j==3){
//                break@innerloop
                break@loop
            }
        }
        if(i == 3)
            break@loop
    }
    println("END")
}