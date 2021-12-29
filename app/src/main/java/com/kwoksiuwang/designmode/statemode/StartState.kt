package com.kwoksiuwang.designmode.statemode

import android.util.Log

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
class StartState(stateMachine: StateMachine) : ISceneState(stateMachine) {
    override fun stateBegin() {
        Log.d(StateModeTag, "StartState begin")
    }

    override fun stateEnd() {
        Log.d(StateModeTag, "StartState end")
    }

    override fun stateUpdate() {
        Log.d(StateModeTag, "StartState update 直接跳转到菜单页面")
        stateMachine.setState(StateMachine.STATE_MAIN_MENU)

    }

    override fun doSomething() {
        Log.d(StateModeTag, "StartState doSomething 啥也不做")
    }
}