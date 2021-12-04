package model

data class Pokemon(
    val hp: Int,
    val type: String,
    val status: MutableMap<String, Int>,
    val technique: MutableMap<String, Int>
)
