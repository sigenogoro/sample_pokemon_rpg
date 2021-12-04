import Enemy.Enemy
import Player.Player
import model.Pokemon

fun main() {
    println("ーーーーーーーーーーーーー")
    println("あなたのポケモンを選んでください")
//    pokemonをランダムで取得する
    val player: Pokemon = Player().select()
    val enemy: Pokemon = Enemy().select()

    println("バトルスタート")

}