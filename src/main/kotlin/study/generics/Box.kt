package study.generics

class Box<T> {
    var label: String = ""
    var content: T? = null

    fun setValue(label: String, content: T) {
        this.label = label
        this.content = content
    }

    fun printValues() {
        println("$label: $content")
    }
}

fun main() {
    val box1 = Box<String>()
    val box2 = Box<Int>()

    box1.setValue(
        "文字列", "アイウエオ"
    )

    box2.setValue(
        "整数", 12345
    )

    box1.printValues()
    box2.printValues()

}