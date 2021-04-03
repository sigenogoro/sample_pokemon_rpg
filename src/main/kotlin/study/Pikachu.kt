package study

class Pikachu(
    override val type1: String,
    override val type2: String,
    override val hp: Int
): Pokemon() {
    override fun attack(){
        println("${super.getName()} の10万ボルト！")
    }
}