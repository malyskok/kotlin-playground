package org.example.com.kotlinplayground.classes

fun cast(type: Any){
    when(type){
        is User -> {
            var user = type //as User // No cast needed
            println(user.name) //Smart cast to org.example.com.kotlinplayground.classes.User
        }
        is String -> println(type.lowercase())
    }
}

fun main() {
    cast(User("Kamil"))
    cast("Kamil")

    val dnum = 2.0
//    val some = dnum as Int // class java.lang.Double cannot be cast to class java.lang.Integer
    val inum = 2
    val some = inum.toDouble()
    println(some)
}