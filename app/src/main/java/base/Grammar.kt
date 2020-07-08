package base

fun main() {
    println("Hello world!")
    println(sum(1, 9))
    println("推断" + sum1(1, 9))
    printSum(1, 9)
    printSum2(1,9)
}

//函数
fun sum(a: Int, b: Int): Int {
    return a + b;
}

//推断类型
fun sum1(a: Int, b: Int) = a + b;

//函数返回无意义值
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}");
}

//Unit 返回类型可以省略
fun printSum2(a: Int,b: Int){
    println("sum of $a and $b is ${a + b}");
}

