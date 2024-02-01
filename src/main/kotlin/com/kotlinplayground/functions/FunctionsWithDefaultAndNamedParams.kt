package org.example.com.kotlinplayground.functions

import java.time.LocalDate

fun main() {
    printUserDetails("Kamil")
    printUserDetails("Kamil", "km@mail.com")
    printUserDetails(name = "Kamil", dob = LocalDate.of(2000,1,1))
    printUserDetails(dob = LocalDate.of(2000,1,1), name = "Kamil")
}

fun printUserDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
){
    println("name: $name, email: $email, dob: $dob")
}