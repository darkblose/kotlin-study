package com.practice.lec03

import com.lannstark.lec03.Person

fun main() {
    val number1 = 1
    val number2: Long = number1.toLong()

    val number3 = 3
    val number4 = 4
    println(number3 / number4.toDouble())

    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L

    val name = "김철수"
    val str = """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABCD"
    println(str2[1])
    println(str2[3])
}

fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {
        val person1 = obj as Person
        println(person1.age)

        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any) {
    if (obj !is Person) {

    }
}

fun printAgeIfPerson3(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

fun printName() {
    val person = Person("홍길동", 100)
    println("이름: ${person.name}")
}