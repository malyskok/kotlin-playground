package org.example.com.kotlinplayground.classes

object Authenticate {
    fun authenticate(login: String){
        println("authenticating $login")
    }
}

fun main() {
    Authenticate.authenticate("Kamil")
}