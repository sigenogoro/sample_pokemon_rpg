package controller

import FactoryInstance
import enemy.Enemy
import player.Player

fun main() {
    val userFactory = FactoryInstance()
    val player = userFactory.create("player")
    println("ーーーーーーーーーーーーー")
    println("あなたのポケモンを選んでください")


    println("バトルスタート")

}