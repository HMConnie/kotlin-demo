package com.sgcai.kotlin

import java.math.BigDecimal

fun main() {

    var i: Int? = null // ？表示可以为空数据类型


//    var num = BigDecimal("111")
//    var plusSum = num.add(BigDecimal.TEN)
//    println("plusSum = $plusSum")
//    var rect = Rect(1,2)

//    var abstractClass = AbstractClassImpl()
//    abstractClass.test()
//    abstractClass.test02()


//
//    var delegateClass = DelegateClass()
//    delegateClass.test()
//    delegateClass.test02()


    SealedClass.OpenSealed1.customPrintln()
    SealedClass.OpenSealed2.customPrintln()

}