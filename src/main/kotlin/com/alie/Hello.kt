package com.alie

fun main(args: Array<String>) {
//    println("Hello Kotlin")
    val h = Human(73f, 163f, "Alie")
    h.hello()

    val height = 163
    var name: String
    name = "Alie"


}

// 主要 constructor
class Human( var weight: Float, var height: Float, var name: String = "" ) {
    //
    init {
        var score: Int
        var average: Int
        score = 80
    }
    // 次要 constructor
    constructor( test:String, height: Float, weight: Float):this(weight, height)

    fun hello(){
        println("Hello Kotlin / $name , $weight, $height / ${bmi()}")
    }

    fun bmi(): Float{
        val bmi: Float = weight / (height*height)
        return bmi
    }
}