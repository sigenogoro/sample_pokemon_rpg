
import player.Player

class FactoryInstance {

    fun create(type: String): Player {
        return Player()
    }
}