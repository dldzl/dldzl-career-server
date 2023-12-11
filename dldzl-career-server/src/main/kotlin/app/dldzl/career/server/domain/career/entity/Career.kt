package app.dldzl.career.server.domain.career.entity

import app.dldzl.career.server.domain.base.entity.BaseEntity
import app.dldzl.career.server.domain.careertype.entity.CareerType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity(name = "tbl_careers")
class Career(

    @ManyToOne
    @JoinColumn(
        name = "job_type_id",
        nullable = false,
    )
    val careerType: CareerType,

    @Column(length = 256)
    val title: String,
) : BaseEntity()
