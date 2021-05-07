package com.smackwerks.whistle.api

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import java.io.InputStream
import java.io.OutputStream

class AbstractResponder : RequestStreamHandler {
    override fun handleRequest(input: InputStream, output: OutputStream, context: Context) {

    }
}


Map -> RequestObject -> ResponseObject -> ApiGatewayResponse