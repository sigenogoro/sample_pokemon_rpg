package player

import model.Pokemon
import pokemonDb.Fire

class PlayerImp(
    val firePokemon: Fire
) : Player {
    override fun getSelect(selectId: Int): Pokemon {
        return firePokemon.get(selectId)
    }
}