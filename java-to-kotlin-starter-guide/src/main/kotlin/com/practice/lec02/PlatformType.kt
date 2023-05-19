package com.practice.lec02

import com.lannstark.lec02.Person

fun main() {
    val person = Person("홍길동")
    println(startsWithA(person.name))
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}
