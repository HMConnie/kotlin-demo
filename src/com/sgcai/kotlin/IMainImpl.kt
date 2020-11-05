package com.sgcai.kotlin

/**
 * 单例对象，采用关键字object
 */
object IMainImpl : IMain {
    override fun test() {
        println("实现接口test方法+obj = $this")
    }

    override fun test02() {
        println("实现接口test02方法+obj = $this")
    }

}