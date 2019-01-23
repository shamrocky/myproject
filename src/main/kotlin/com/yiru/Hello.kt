package com.yiru

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().Hello()
    val h=Human()
    h.Hello()
    val age : Int=19
    var age2 : Int=20
    age2=21
    var weight=66.5f
    val name : String
    name="Yiru"
    println(name)
}

class Human{
    fun Hello(){
        println("Hello Kotlin.")
    }
}