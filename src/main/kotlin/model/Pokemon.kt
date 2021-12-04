package model

data class Pokemon(
    val pokemonId: Long,
    val hp: Int,
    val type: String,
    val status: MutableMap<String, Int>,
    val technique: MutableMap<String, Int>
)
