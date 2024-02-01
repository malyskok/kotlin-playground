package org.example.com.kotlinplayground.classes

open class User(val name: String) {
    open val isLoggedIn = false;
    open fun log(){
        println("log from User")
        callPrivateFunction()
        callProtectedFunction()
    }

    companion object {
        const val PREFIX = "MS"
        fun logPrefix(){
            println(PREFIX)
        }
    }

    private fun callPrivateFunction(){
        println("I'm private function")
    }

    open protected fun callProtectedFunction(){
        println("I'm private function")
    }

    public fun logout(){
        println("logout")
    }
}

class Student(name: String) : User(name){
    override val isLoggedIn = true;

    companion object {
        const val PREFIX = "MR"
        fun logPrefix(){
            println(PREFIX)
        }
    }

    override fun log(){
        println("log from Student")
        super.log()
//        callPrivateFunction(); Cannot access 'callPrivateFunction': it is invisible (private in a supertype) in 'Student'
        callProtectedFunction()
    }

//    override fun callPrivateFunction(){} 'public open fun callPrivateFunction(): Unit defined in org.example.com.kotlinplayground.classes.Student' has no access to 'private final fun callPrivateFunction(): Unit defined in org.example.com.kotlinplayground.classes.User', so it cannot override it
    override fun callProtectedFunction(){
        println("protected from student")
    }
}

fun main() {
    val student = Student("Kamil")
    student.log()
    println(student.name)
    println(student.isLoggedIn)

    val user = Student("Kamil")
    user.log()

    println("${Student.PREFIX} ${student.name}")
    Student.logPrefix()
    User.logPrefix()

    val user2 = User("Kamil")
//    user2.callPrivateFunction() Cannot access 'callPrivateFunction': it is private in 'User'
//    user2.callProtectedFunction() Cannot access 'callProtectedFunction': it is protected in 'User'
    user2.logout()
}