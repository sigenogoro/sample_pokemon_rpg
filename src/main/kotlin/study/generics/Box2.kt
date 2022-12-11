package study.generics

class Box2<T>(
    val value: T
)

fun main() {
    val boxInt = Box2(value = 1234)
    val boxString = Box2("アイウエオ")

    println(boxInt.value)
    println(boxString.value)
}