package base

import androidx.constraintlayout.solver.widgets.Rectangle

fun main() {

    //for循环
    var items = listOf("apple", "banana", "kiwifruit");
    for (item in items) {
        println(item)
    }
    //或
    var items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items2.indices) {
        println("item as $index is ${items2[index]}")
    }

    //while循环
    var itemw = listOf("apple", "banana", "kiwifruit")
    var index = 0;
    while (index < itemw.size) {
        println("item at $index is ${itemw[index]}")
        index++;
    }

    //when表达式
    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "UnKnow"
        }

    println(describe("Hello"))

    //使用区间
    //使用 in 运算符来检测某个数字是否在指定区间内
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("first in range")
    }

    //检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    //区间迭代
    for (x in 1..5) {
        print(x)
    }
    println()
    //或数列迭代
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    println()
    //集合
    //对集合进行迭代
    for (item in items) {
        println(item)
    }
    //使用 in 运算符来判断集合内是否包含某实例
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apples is fine too")
    }

    //使用lambda 表达式来过滤（filter） 与映射（map）集合
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }//排序
        .map { it.toUpperCase() }
        .forEach { println(it) }

}

