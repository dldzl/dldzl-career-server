package app.dldzl.career.server.domain.careertype.entity

import app.dldzl.career.server.domain.base.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity(name = "tbl_career_types")
class CareerType(

    @Column(length = 128)
    val title: String,
) : BaseEntity()
