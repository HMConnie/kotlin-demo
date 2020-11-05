package com.sgcai.kotlin

sealed class JumpType {
    class LOGIN(var redirectClass: String) : JumpType() {

        fun jumpLogin() {
            println("跳转到登录页面 redirectClass = $redirectClass")
        }
    }

    class PAY(var tagIndex: Int) : JumpType() {

        fun jumpPay() {
            println("跳转到支付页面 tagIndex = $tagIndex")
        }
    }
}

fun main(args: Array<String>) {


    var list = listOf(JumpType.LOGIN("支付页面"), JumpType.PAY(1))
    for (jump in list) {
        when (jump) {
            is JumpType.LOGIN -> jump.jumpLogin()
            is JumpType.PAY -> jump.jumpPay()
        }
    }
}