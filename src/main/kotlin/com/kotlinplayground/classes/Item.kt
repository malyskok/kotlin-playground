package org.example.com.kotlinplayground.classes

enum class Type{
    FOOD, DEVICE, NONE
}

class Item() {
    var type: Type = Type.NONE
    var name: String = "noname"
        get() {
            println("name getter")
            return field
        }
    var price: Double = 0.00
        get() {
            println("price getter")
            return field
        }
        set(value) {
            println("price setter")
            if (value > 0) {
                field = value
            } else {
                throw IllegalArgumentException("price cannot be lower than 0")
            }
        }

    constructor(_name: String, _price: Double, _type: Type) : this() {
        name = _name
        price = _price
        type = _type
    }

    constructor(_name: String, _price: Double) : this() {
        name = _name
        price = _price
        type = Type.NONE
    }

    override fun toString(): String {
        return "Item(type=$type, name='$name', price=$price)"
    }


}

fun main() {
//    val item = Item()
//    println(item.name)
//    item.name = "item"
//    println(item.name)

    val item2 = Item("donut", 2.00, Type.FOOD)
    println(item2.name)
    println(item2.price)
    item2.price = 5.00
    println(item2.price)

}