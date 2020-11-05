package com.sgcai.kotlin

/**
 * sealed 密封类,不可以实例化
 */
sealed class SealedClass {

    object OpenSealed1 : SealedClass() {
        var i = 1
        var j = 2
        fun calc(): Int = i + j

        fun customPrintln() {
            println(" object OpenSealed1 println obj = $this")
        }
    }

    object OpenSealed2 : SealedClass() {
        fun customPrintln() {
            println(" object OpenSealed2 println obj = $this")
        }
    }
}