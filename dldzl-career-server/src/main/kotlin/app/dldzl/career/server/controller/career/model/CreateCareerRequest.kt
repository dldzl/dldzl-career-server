package app.dldzl.career.server.controller.career.model

import java.util.UUID

data class CreateCareerRequest(
    val careerTypeId: UUID,
    val name: String,
)
