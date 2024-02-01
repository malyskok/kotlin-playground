package org.example.com.kotlinplayground.classes

data class DataClass(val id: Int, var name: String = "") {
}

class NormalClass(val id: Int, var name: String = "") {
}

fun main() {
    var data1 = DataClass(1)
    println(data1)
    var data2 = DataClass(2, "data1")
    println(data2)
    var data2copy = data2.copy(id = 3)
    println(data2copy)
    data2copy.name = "data3"
    println(data2copy)
    println(data2)

    println(data1 == data1)
    println(data1 == data2)

    var data1copy = data1.copy()
    println(data1 == data1copy)

    val normal1 = NormalClass(1, "name1")
    val normal2 = NormalClass(1, "name1")
    println(normal1 == normal2)
}