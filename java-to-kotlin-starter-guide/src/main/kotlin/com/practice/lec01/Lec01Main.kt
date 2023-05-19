package com.practice.lec01

fun main() {
    var number1: Long = 1L // 가변

    var number2 = 2L
    number2 = 3L

    val number3 = 3L // 불변 = final

    var number4: Long
    number4 = 4
    println(number4)

    val number5: Long
    number5 = 5L
    println(number5)

    /**
     * Primitive 와 reference
     * 코틀린이 알아서 처리
     */
    var number6 = 10L
    var number7 = 1_000L

    /**
     * nullable
     */
    var number8: Long? = 1_000L
    number8 = null

    var person = Person("홍길동", 10)
    println(person.name)
    println(person.age)
}