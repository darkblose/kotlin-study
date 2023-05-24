package com.practice.lec08

fun main() {
    repeat("Hello World!", useNewLine = false)
    repeat("Hello World!")

    printNameAndGender(gender = "MALE", name = "홍길동")

    printAll("A", "B", "C")

    val array = arrayOf("A", "R", "R", "A", "Y")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..3) {
        if (useNewLine) {
            println("str = ${str}")
        } else {
            print("str = ${str}")
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}