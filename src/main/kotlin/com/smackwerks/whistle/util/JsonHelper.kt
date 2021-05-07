package com.smackwerks.whistle.util

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okio.buffer
import okio.source
import java.io.InputStream

inline fun <reified T> parseJsonObject(input: InputStream): T? =
    try {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter(T::class.java)
            .fromJson(input.source().buffer())
    } catch (ex: Exception) {
        "com.smackwerks.whistle.util.JsonHelper".e("Failed to parse json", ex)
        null
    }

inline fun <reified T : Any> parseJsonArray(input: InputStream): List<T>? =
    try {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<T>>(Types.newParameterizedType(List::class.java, T::class.java))
            .fromJson(input.source().buffer())
    } catch (ex: Exception) {
        "com.smackwerks.whistle.util.JsonHelper".e("Failed to parse json", ex)
        null
    }
