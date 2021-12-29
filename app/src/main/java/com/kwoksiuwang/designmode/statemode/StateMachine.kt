package com.kwoksiuwang.designmode.statemode

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
class StateMachine {
    //这里根据不同的情况选择是否存储状态变量。
    private val startState: ISceneState by lazy { StartState(this) }
    private val mainMenuState: ISceneState by lazy { MainMenuState(this) }
    private val battleState: ISceneState by lazy { BattleState(this) }

    companion object {
        const val STATE_START = 1
        const val STATE_MAIN_MENU = 2
        const val STATE_BATTLE = 3
    }

    var currentState: ISceneState? = null

    init {
        setState(STATE_START)
    }

    fun setState(stateInt: Int) {
        //或许要加锁
        val nextState: ISceneState? = when (stateInt) {
            STATE_START -> startState
            STATE_MAIN_MENU -> mainMenuState
            STATE_BATTLE -> battleState
            else -> null
        }
        currentState?.stateEnd()
        currentState = nextState
        currentState?.stateBegin()
    }

    fun stateUpdate() {
        currentState?.stateUpdate()
    }

    fun doSomething() {
        currentState?.doSomething()
    }
}