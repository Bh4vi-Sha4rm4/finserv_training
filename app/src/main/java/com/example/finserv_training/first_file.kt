package com.example.finserv_training

import java.util.*

fun myFun(name : String, age : Int, a: Array<Int>){
    for( i in a){
        println(i)
    }
}
fun main() {
    println("Hello, world!!!")

    var sc = Scanner(System.`in`)
    println("enter your name: ")
    var name : String = sc.nextLine()
    println("Enter your age: ")
    var age: Int = sc.nextInt()
    /*println("Enter the number of array elements: ")

    var n: Int = sc.nextInt()*/
    var arr = arrayOf(4,5,6,7,8,9,90,100)
    myFun(name, age, arr)
}