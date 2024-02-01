package org.example.com.kotlinplayground.classes

class Person(val name: String = "noname", val age: Int = 0) {

    var email: String = "abc@mail.com"
    var length: Int = 0

    constructor(_email:String) : this(){
        email=_email
    }

    init {
        println("init")
        println("name:${name} from init")
        length=name.length
    }

    constructor(_email:String, _name:String, _age:Int) : this(_name, _age){
        println("constructor")
        email=_email
    }

    fun walk(){
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Kamil", 30)
//    person.walk()
//    println("Person name: ${person.name}, age: ${person.age}")
//
//    val person1 = Person()
//    println("Person name: ${person1.name}, age: ${person1.age}, email: ${person1.email}")
//
//    val person2 = Person("kamil@mail.com")
//    println("Person name: ${person2.name}, age: ${person2.age}, email: ${person2.email}")

    val person3= Person("kamil@mail.com", "Kamil", 30)
    println("Person name: ${person3.name}, age: ${person3.age}, email: ${person3.email}, length: ${person3.length}")
}