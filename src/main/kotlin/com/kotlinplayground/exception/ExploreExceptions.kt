package org.example.com.kotlinplayground.exception

fun main() {
    var names: MutableList<String?> = mutableListOf("Kamil", null)
    names.forEach {
        val result = try {
            it!!.length
        } catch (ex: Exception) {
            println(ex.message)
            println(ex)
            "abc" // infer??
        }
        println(result)
    }
}