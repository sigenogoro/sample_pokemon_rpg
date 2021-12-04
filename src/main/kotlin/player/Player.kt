package player

import model.Pokemon
import pokemonDb.Fire

class Player(
    val firePokemon: Fire
) {
    fun getSelect(selectId: Int): Pokemon {
        return firePokemon.get(selectId)
    }
}