package com.smackwerks.whistle.util

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

fun <T: Any> T.logger(): Logger = LogManager.getLogger(this::class.java)

fun <T: Any> T.d(msg: String) = logger().debug(msg)

fun <T: Any> T.i(msg: String) = logger().info(msg)

fun <T: Any> T.e(msg: String) = logger().error(msg)
fun <T: Any> T.e(msg: String, throwable: Throwable) = logger().error(msg, throwable)

fun <T: Any> T.w(msg: String) = logger().warn(msg)
fun <T: Any> T.w(msg: String, throwable: Throwable) = logger().warn(msg, throwable)