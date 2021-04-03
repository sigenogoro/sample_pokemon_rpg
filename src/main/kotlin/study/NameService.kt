package study

interface NameService {
    fun changeName(newName: String)
    fun getName(): String
}