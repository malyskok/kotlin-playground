package org.example.com.kotlinplayground.classes

interface CourseRepository {
    fun findById(id: Int)
    fun getAll(){
        println("abstract get all")
    }
}

interface Repository{
    fun init(){
        println("init abstract repo")
    }
}

class SQLRepository : CourseRepository, Repository{
    override fun findById(id: Int){
        println("sql findById")
    }

    override fun init() {
        super.init()
        println("init sql repo")
    }
}

interface A{
    val toOverrideValue: String
    fun hello(){
        println("A")
    }
}

interface B{
    fun hello(){
        println("B")
    }
}

class C : A, B{
    override val toOverrideValue: String = "c-value"

    override fun hello(){
        super<A>.hello();
        super<B>.hello()
        println("C")
        println(toOverrideValue)
    }
}

fun main() {
    val courseRepository = SQLRepository()
    courseRepository.init()
    courseRepository.findById(1)
    courseRepository.getAll()
    val c = C()
    c.hello()
}