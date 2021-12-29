package com.kwoksiuwang.designmode.statemode

/**
 *  Created by kwoksiuwang on 2021/12/29!!!
 */
public const val StateModeTag = "StateModeTag"

public abstract class ISceneState(val stateMachine: StateMachine) {
    //状态开始时被调用
    public abstract fun stateBegin()

    //状态被终止时被调用
    public abstract fun stateEnd()

    //状态的通用行为。每n秒被调用一次，模拟垂直同步或者unity中的onUpdate
    public abstract fun stateUpdate()

    //状态的通用行为
    public abstract fun doSomething()
}