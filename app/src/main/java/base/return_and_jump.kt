package base

fun main() {
    foo()
    println("===========================================")
    foo1()
    println("===========================================")
    foo2()
    println("===========================================")
    foo3()
    println("===========================================")
    foo4()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return //非局部直接返回到 foo() 的调用者
        println(it)
    }
    println("this point is unreachable")
}

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit //局部返回到该lambda 表达式的调用者，即 forEach 循环
        println(it)
    }
    println("done with explicit label")
}

fun foo2(){
    listOf(1,2,3,4,5).forEach {
        if (it==3) return@forEach  //局部返回到该 lambda 表达式的调用者，即forEach 循环
        println(it)
    }
    println("done with implicit label")
}

fun foo3(){
    listOf(1,2,3,4,5).forEach (fun(value:Int){
        if (value==3) return
        println(value)
    })
    println("done with anonymous function")
}

fun foo4(){
    run loop@{
        listOf(1,2,3,4,5).forEach {
            if (it==3)return@loop //从传入 run 的 lambda 表达式非局部返回
            println(it)
        }
        println("done with nested loop")

    }
}