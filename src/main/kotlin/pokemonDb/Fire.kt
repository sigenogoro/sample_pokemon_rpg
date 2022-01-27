package pokemonDb

import model.Pokemon

class Fire() {
    fun firePokemon(): Pokemon {
        return Pokemon(
            pokemonId = 1,
            hp = 100,
            type = "Fire",
            status = mutableMapOf(
                "offensive" to 100,
                "defense" to 100,
                "speed" to 100
            ),
            technique = mutableMapOf(
                "strongAttack" to 10,
                "strongerAttack" to 30,
                "IncreaseDefense" to 10,
                "IncreaseSpeed" to 10
            )
        )
    }
}
