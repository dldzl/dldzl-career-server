package app.dldzl.career.server.controller.careertype.model

import app.dldzl.career.server.domain.careertype.entity.CareerType
import java.util.UUID

data class CareerTypeResponse(
    val careerTypeId: UUID,
    val name: String,
)

fun CareerType.toResponse(): CareerTypeResponse = CareerTypeResponse(
    careerTypeId = this.id,
    name = this.title,
)

fun List<CareerType>.toResponse(): List<CareerTypeResponse> = this.map(CareerType::toResponse)
