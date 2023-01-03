package study.generics

// ジェネリクス関数
fun <T> create(str: T): T {
    return str
}

fun main() {
    val p1 = create(100)
    val p2 = create("文字列")
    println(p1)
    println(p2)
}