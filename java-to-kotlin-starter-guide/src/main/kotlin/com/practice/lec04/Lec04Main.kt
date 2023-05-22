package com.practice.lec04

import com.lannstark.lec04.JavaMoney

fun main() {
    val javaMoney1 = JavaMoney(2_000L)
    val javaMoney2 = JavaMoney(1_000L)

    if (javaMoney1 > javaMoney2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val javaMoney3 = javaMoney1; //동등성과 동일성
    val javaMoney4 = JavaMoney(2_000L)

    println("javaMoney1와 javaMoney3의 동일성: ${javaMoney1 === javaMoney3}")
    println("javaMoney1와 javaMoney3의 동등성: ${javaMoney1 == javaMoney3}")
    println("javaMoney1와 javaMoney4의 동일성: ${javaMoney1 === javaMoney4}")
    println("javaMoney1와 javaMoney4의 동등성: ${javaMoney1 == javaMoney4}")

    if (fun1() || fun2()) { // Lazy 연산
        println("실행")
    }

    if (fun2() && fun1()) { // Lazy 연산
        println("실행")
    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
    println(money1.plus(money2))
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}