package org.example.com.kotlinplayground.nulls

data class Movie(val id: Int?, val name: String)

fun main() {
    var nonNullName: String
    //println(nonNullName) Variable 'nonNullName' must be initialized
//    nonNullName = null Null can not be a value of a non-null type String
    nonNullName = "Kamil"
    println(nonNullName)

    var nullableName: String?
    nullableName = null
    println(nullableName)
    nullableName = "Kamil"
    println(nullableName)

    val movie = Movie(null, "Avatar")
    println(movie)
    val savedMovie = saveMovie(movie)
//    movie.id = 1 Val cannot be reassigned
    println(savedMovie)

    var nullableval2: String? = null
//    println(nullableval2.length) //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(nullableval2?.length)

    var length :Int? = nullableval2?.length ?: 0
    println(length)
//    length=null
    var some = length!!
    println(some)

    val movie2 = Movie(null, "Avatar2")
    //println(movie2.id!!) //Exception in thread "main" java.lang.NullPointerException

    castNumber("abc")

    var nullableName2: String? = null
//    printname(nullableName2) //Type mismatch. Required: String Found: String?
    nullableName2 = "Kamil"
    println(nullableName2?.run {
        printname(this)
        printname2(this)
    })
}

fun printname(name: String) {
    println("printname")
    println(name)
}

fun printname2(name: String?) {
    println("printname2")
    println(name)
}


fun saveMovie(movie: Movie): Movie {
    return movie.copy(1)
}

fun castNumber(any: Any){
    when(any){
        any as? Double -> println("Value is Double")
        any as? Int -> println("Value is Int")
        else -> println("not known value")
    }
}
