package com.smackwerks.whistle.provider.aws


data class ApiGatewayRequest(
    val message: String?,
    val input: Input?
)

data class Input(
    val resource: String?,
    val path: String?,
    val httpMethod: String?,
    val headers: Map<String, String>?,
    val queryStringParameters: Map<String, String>?,
    val pathParameters: PathParameters?,
    val stageVariables: StageVariables?,
    val requestContext: RequestContext?,
    val body: String?,
    val isBase64Encoded: Boolean?
)

data class PathParameters(
    val proxy: String?
)

data class StageVariables(
    val stageVariableName: String?
)

data class RequestContext(
    val accountId: String?,
    val resourceId: String?,
    val stage: String?,
    val requestId: String?,
    val identity: Identity?,
    val resourcePath: String?,
    val httpMethod: String?,
    val apiId: String?
)

data class Identity(
    val cognitoIdentityPoolId: Any?,
    val accountId: Any?,
    val cognitoIdentityId: Any?,
    val caller: Any?,
    val apiKey: Any?,
    val sourceIp: String?,
    val cognitoAuthenticationType: Any?,
    val cognitoAuthenticationProvider: Any?,
    val userArn: Any?,
    val userAgent: String?,
    val user: Any?
)