package app.dldzl.career.server.controller.career.model

import app.dldzl.career.server.domain.career.entity.Career
import java.util.UUID

data class CareerResponse(
    val id: UUID,
    val careerTypeId: UUID,
    val title: String,
)

fun Career.toResponse(): CareerResponse = CareerResponse(
    id = this.id,
    careerTypeId = this.careerType.id,
    title = this.title,
)

fun List<Career>.toResponse(): List<CareerResponse> = this.map(Career::toResponse)
