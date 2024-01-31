package org.example.com.kotlinplayground

fun main (){

    val name : String = "Kamil"
    //name = "Dilip" //Val cannot be reassigned
    println(name)

    var age : Int = 30
    println(age)
    age = 35
    println(age)

    val salary : Long = 3000
    val salary2 : Long = 4000L
    val salary3 = 5000L
    println("$salary $salary2 $salary3")

    val course = "Kotlin course"
    println("course is $course and its length is ${course.length}")

    var multiline = "ABC \nDEF"
    println(multiline)
    multiline = "ABC \n DEF"
    println(multiline)

    var tripleLine = """
    ABC
        DEF
    """.trimIndent()
    println(tripleLine)

    tripleLine = """
ABC
        DEF
    """
    println(tripleLine)
}
