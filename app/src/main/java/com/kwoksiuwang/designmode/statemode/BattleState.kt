package com.kwoksiuwang.designmode.statemode

import android.util.Log

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
class BattleState(stateMachine: StateMachine) : ISceneState(stateMachine) {
    private var count = 0
    override fun stateBegin() {
        count = 0
        Log.d(StateModeTag, "BattleState begin")
    }

    override fun stateEnd() {
        Log.d(StateModeTag, "BattleState end")
    }

    override fun stateUpdate() {
        Log.d(StateModeTag, "BattleState update")
    }

    override fun doSomething() {
        val random = Math.random()
        if (random > 0.66) {
            count++
        }
        Log.d(StateModeTag, "BattleState doSomething, count : $count, random : $random")
        if (count > 5) {
            stateMachine.setState(StateMachine.STATE_MAIN_MENU)
        }
    }
}