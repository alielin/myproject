package com.alie.student2

fun main(args: Array<String>) {
    val stu = Student("Alie", 90, 60)
    stu.print()
}

class Student(var name: String, var math: Int, var english: Int){
    fun print(){
        println(name+ "\t"+math + "\t" + english + "\t" + (math+english)/2)
    }
}