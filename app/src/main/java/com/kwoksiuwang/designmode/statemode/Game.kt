package com.kwoksiuwang.designmode.statemode

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
class Game {
    init {
        val stateMachine = StateMachine()
        GlobalScope.launch {

            while (true) {
                delay(100)
                stateMachine.stateUpdate()

            }
        }
        GlobalScope.launch {
            while (true) {
                delay(1000)
                //模拟触发事件
                stateMachine.doSomething()
            }
        }
    }
}