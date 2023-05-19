package com.practice.lec02

fun main() {
    var str1: String? = "ABC"
    println(str1?.length)

    var str2: String? = null
    println(str2?.length)

    var str3: String? = null
    println(str3?.length ?: 0)

    println(startsWith("ABC"))
    println(startsWith(null))
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA1WithJava(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA2WithJava(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA3WithJava(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}