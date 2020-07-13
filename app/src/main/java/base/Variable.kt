package base

import kotlin.math.max

fun main() {
    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int  // 如果没有初始值类型不能省略
    c = 3

    println("a = $a, b = $b, c = $c")

    var x = 5 //自动推断出 int 类型
    x += 1
    println("x = $x")

    val PI = 3.14
    var x1 = 0

    fun incrementX() {
        x1 += 1
        println(x1)
    }

    println(x1)
    incrementX()

    ///字符串模板
    var z = 1
    //模板中的简单名称
    val s1 = "a is $a"

    z = 2
    val z2 = "${s1.replace("is", "was")},but now is $z"
    println(z2)

    //条件表达式
    fun maxoOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
    println(maxoOf(1, 5))

    //在kotlin中，if也可以用作表达式
    fun maxOfs(a: Int, b: Int) = if (a > b) a else b
    println(maxOfs(1, 5))

    //空值与null检测
    //当某个变量值可以为null 的时候，必须在声明后添加? 来标识该引用可为空
    //如果 str 的内容不是数字返回值 null
    fun parseInt(str: String): Int {
        return str.toInt();
    }

    //使用返回可空值的函数
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
        if (x != null && y != null) {
            // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
            println(x * y)
        } else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

    println(printProduct("2", "3"))


    //类型检测与自动类型转换
    //is 运算符检测一个表达式是否某类型的一个实例，如果一个不可变的局部变量或属性已经判断出为某类型，
    //那么检测后的分支中可以直接当作该类型使用，无需显示转换：
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            //'obj' 在该条件分支内自动转换成 ‘String’
            return obj.length
        }
        // 在离开类型检测分支后，‘obj’ 仍然是 ‘Any’ 类型
        return null
    }

    //或
    fun getStringLength2(obj: Any): Int? {
        if (obj !is String) return null
        // 'obj' 在这一分支自动转化为 ‘String’
        return obj.length
    }

    //或
    fun getStringLength3(obj: Any): Int? {
        //'obj' 在 ‘&&’ 右边自动转成功 ‘String’ 类型
        if (obj is String && obj.length>0){
            return obj.length
        }
        return null
    }
}