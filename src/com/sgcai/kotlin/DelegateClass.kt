package com.sgcai.kotlin

class DelegateClass : IMain {

    override fun test() {
        IMainImpl.test()
        println("DelegateClass 接口实现test方法")
    }

    override fun test02() {
        IMainImpl.test02()
        println("DelegateClass 接口实现test02方法")
    }
}