package app.dldzl.career.server.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity(name = "tbl_career")
data class Career(

    @Id
    val id: UUID,

    @ManyToOne
    @JoinColumn(
        name = "job_type_id",
        nullable = false,
    )
    val jobType: JobType,

    @Column
    val name: String,
)
