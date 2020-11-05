package com.sgcai.kotlin

/***
 * kotlin 闭包
 */
fun main() {
    var list = listOf("a", "b", "c")
    //第一种遍历
    list.forEach(fun(e) { println(e) })
    println("===========================")
    //第二种遍历
    list.forEach({ e -> println(e) })

    println("===========================")
    //第三种遍历
    list.forEach({ println(it) })
    println("===========================")
    //第四种遍历,最简单
    list.forEach { println(it) }
}