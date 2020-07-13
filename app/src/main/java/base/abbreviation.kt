package base

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main() {
    //if not null 缩写
    val files = File("Test").listFiles();
    println(files?.size)

    //if not null and else 缩写
    val files2 = File("Test").listFiles()
    println(files2?.size ?: "empty")

    //java 7 的 try with resource
//    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
//    stream.buffered().reader().use { reader -> println(reader.readText()) }

    //交换两个变量
    var a = 1
    var b = 2
    a = b.also { b = a }
    println("a : $a   b : $b")
}