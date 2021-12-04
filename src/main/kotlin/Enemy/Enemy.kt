package Enemy

import model.Pokemon

//　敵クラス
class Enemy {
    fun select(): Pokemon {
        return Pokemon(
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
            ),
        )
    }
}