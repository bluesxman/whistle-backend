package com.smackwerks.whistle.api

import com.smackwerks.whistle.util.d

class Schedule {
    fun greet(name: String): String {
        d("greet($name)")
        return "Hello, $name!!!"
    }
}
