package player

import model.Human
import model.Pokemon
import pokemonDb.Fire

class Player() : Human {
    fun getPokemon(): Pokemon {
        return Fire().firePokemon()
    }
}