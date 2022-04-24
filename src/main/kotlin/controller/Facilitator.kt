package controller

import FactoryInstance

fun main() {
    val userFactory = FactoryInstance()
    val player = userFactory.createPlyer("player")
    val enemy = userFactory.createEnemy("Enemy")
    println("ーーーーーーーーーーーーー")
    println("あなたのポケモンを選んでください")

    println(player.getPokemon())
    println(enemy)
}