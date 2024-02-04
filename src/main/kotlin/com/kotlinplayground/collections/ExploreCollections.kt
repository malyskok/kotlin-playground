package org.example.com.kotlinplayground.collections

class ExploreCollections {
}

fun main() {
    val names = listOf("Kamil", "Dilip")
    println("listOf $names")
//    names.add("John") Unresolved reference: add
    println(names.get(0))

    val mutableNames = mutableListOf("Kamil", "Dilip")
    println("mutableListOf $mutableNames")
    mutableNames.add("John")
    println("mutableListOf $mutableNames")

    val namesSet = setOf("Kamil", "Dilip")
    println("namesSet $namesSet")
    println(namesSet.contains("Kamil"))

    val mutableNamesSet = mutableSetOf("Kamil", "Dilip")
    println("mutableNamesSet $mutableNamesSet")
    mutableNamesSet.add("John")
    mutableNamesSet.add("Kamil")
    println("mutableNamesSet $mutableNamesSet")

    val namesMap = mapOf("Kamil" to 1, "Dilip" to 2)
    println("namesMap $namesMap")

    val mutableNamesMap = mutableMapOf(1 to "Kamil" , 2 to "Dilip")
    println("mutableNamesMap $mutableNamesMap")
    mutableNamesMap.put(3, "John") // map.put() should be converted to assignment
    println(mutableNamesMap.get(3)) //Replace function call with indexed accessor.
    mutableNamesMap[3] = "Andrew" // map.put() should be converted to assignment
    println(mutableNamesMap[3]) //Replace function call with indexed accessor.
}