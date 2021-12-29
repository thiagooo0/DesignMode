package com.kwoksiuwang.designmode.statemode

import android.util.Log

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
class MainMenuState(stateMachine: StateMachine) : ISceneState(stateMachine) {
    override fun stateBegin() {
        Log.d(StateModeTag, "MainMenuState begin")
    }

    override fun stateEnd() {
        Log.d(StateModeTag, "MainMenuState end")
    }

    override fun stateUpdate() {
        Log.d(StateModeTag, "MainMenuState update")
    }

    override fun doSomething() {
        Log.d(StateModeTag, "MainMenuState doSomething 跳转")
        stateMachine.setState(StateMachine.STATE_BATTLE)
    }
}