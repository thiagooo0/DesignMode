package com.kwoksiuwang.designmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kwoksiuwang.designmode.statemode.Game

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Game()
    }
}