package com.smackwerks.whistle.api

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Schedule : RequestHandler<String, String> {
    override fun handleRequest(input: String, context: Context): String {
        return greet(input, context)
    }
xxxxx
    fun greet(name: String, context: Context): String {
        context.logger.log("greet($name)")
        return "Hello, $name!!!"
    }
}
