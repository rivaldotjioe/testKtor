package com.rivaldo.testktor.data.remote.dto

import kotlinx.serialization.Serializable


@Serializable
data class PostRequest(
	val title: String? = null,
	val body: String? = null,
	val userId: Int? = null
)
