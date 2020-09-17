package com.test.application.two

/**
 * @Title: AbstractPrint
 * @Author: li.xicai
 * @Date: 2020/9/16 14:13
 * @Description:
 */
open class AbstractPrint {
    open lateinit var text:String

    open fun print(){
        println("abstract print")
    }
}