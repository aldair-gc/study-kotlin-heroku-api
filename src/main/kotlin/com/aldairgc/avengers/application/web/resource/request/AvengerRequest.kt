package com.aldairgc.avengers.application.web.resource.request

import com.aldairgc.avengers.domain.avenger.Avenger
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull


data class AvengerRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val nick: String,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val person: String,
    val description: String? = null,
    val history: String? = null
) {
    fun toAvenger() = Avenger(
        nick = nick,
        person = person,
        description = description,
        history = history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) =
            Avenger(
                id = id,
                nick = request.nick,
                person = request.person,
                description = request.description,
                history = request.history
            )
    }
}