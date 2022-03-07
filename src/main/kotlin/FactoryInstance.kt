
import enemy.Enemy
import model.Human
import player.Player

class FactoryInstance() {
    fun create(userType: String): Human {
        if (userType == "player") {
            return Player()
        } else if (userType == "enemy") {

        }
    }
}