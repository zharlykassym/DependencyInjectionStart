package com.tamerlan.dependencyinjectionstart

class Activity {
    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }

}