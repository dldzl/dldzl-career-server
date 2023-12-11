package app.dldzl.career.server.domain.careertype.entity

import app.dldzl.career.server.domain.base.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.util.UUID

@Entity(name = "tbl_career_types")
class CareerType(

    id: UUID,

    @Column(length = 128)
    val title: String,
) : BaseEntity(id = id)
