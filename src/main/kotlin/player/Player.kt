package player

import model.Pokemon
import pokemonDb.Fire

class Player() {
    fun getPokemon(): Pokemon {
        return Fire().firePokemon()
    }
}