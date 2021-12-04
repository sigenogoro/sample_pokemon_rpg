import enemy.Enemy
import player.Player
import player.PlayerImp
import pokemonDb.Fire

class FactoryInstance {

    fun create(type: String): Any {
        return if (type == "player") {
            Player(
                firePokemon = Fire()
            )
        } else {
            Enemy()
        }
    }
}