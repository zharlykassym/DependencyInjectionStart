package com.tamerlan.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    @Inject
    lateinit var computer: Computer

//    @Inject
//    lateinit var keyboard: Keyboard
//    @Inject
//    lateinit var monitor: Monitor
//    @Inject
//    lateinit var mouse: Mouse

//    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//    val monitor: Monitor = DaggerNewComponent.create().getMonitor()
//    val mouse: Mouse = DaggerNewComponent.create().getMouse()


    init {
        DaggerNewComponent.create().inject(this)

    }

}