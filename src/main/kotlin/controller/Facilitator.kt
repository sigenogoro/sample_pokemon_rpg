package controller

import FactoryInstance
import enemy.Enemy
import player.Player

fun main() {
    val userFactory = FactoryInstance()
    val player = userFactory.create("player")
    val enemy = userFactory.create("Enemy")
    println("ーーーーーーーーーーーーー")
    println("あなたのポケモンを選んでください")

    println(player)
}