package com.kwoksiuwang.designmode.facade

/**
 * 通过外观模式，封装各个复杂的子系统的调用。
 *  Created by kwoksiuwang on 2022/1/11!!!
 */
class GameFacade {
    private val achievementSystem = AchievementSystem()
    private val characterSystem = CharacterSystem()
    private val gameEventSystem = GameEventSystem()

    fun init() {
        //统一初始化
        achievementSystem.init()
        characterSystem.init()
        gameEventSystem.init()
    }

    fun update() {
        //游戏更新时
        gameEventSystem.sendMessage("update")
        characterSystem.update()
    }

    fun gameOver() {
        //游戏结束时
        achievementSystem.setAchievement("finish one")//结算成就
        characterSystem.addGem()//结算宝石
        characterSystem.addGold()//结算金币
        gameEventSystem.sendMessage("gameOver")//发送事件
    }

}