import enemy.Enemy
import player.Player

class FactoryInstance() {
    fun createPlyer(type: String): Player {
        return Player()
    }

    fun createEnemy(type: String): Enemy {
        return Enemy()
    }
}