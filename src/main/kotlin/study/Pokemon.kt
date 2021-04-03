package study

abstract class Pokemon(): NameService{
    private var name: String = ""
    abstract val type1: String
    abstract val type2: String
    abstract val hp: Int

    abstract fun attack()

    override fun changeName(newName: String){
        if(newName == "ピー"){
            println("不適切な名前のため、変更できません")
            return
        }
        this.name = newName
    }

    override fun getName(): String {
        return this.name
    }
}

fun main(){
    val pika = Pikachu("でんき", "",100)
    pika.changeName("適切")
    println(pika.getName())
}
