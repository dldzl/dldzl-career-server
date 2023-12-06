package app.dldzl.career.server.domain.career.entity

import app.dldzl.career.server.domain.careertype.entity.CareerType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity(name = "tbl_careers")
data class Career(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID = UUID(0, 0),

    @ManyToOne
    @JoinColumn(
        name = "job_type_id",
        nullable = false,
    )
    val careerType: CareerType,

    @Column(length = 256)
    val name: String,
)
