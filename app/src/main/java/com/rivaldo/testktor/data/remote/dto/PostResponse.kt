package com.rivaldo.testktor.data.remote.dto

import kotlinx.serialization.Serializable


@Serializable
data class PostResponse(
	val id: Int? = null,
	val title: String? = null,
	val body: String? = null,
	val userId: Int? = null
)
