package app.dldzl.career.server.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity(name = "tbl_job_type")
data class JobType(

    @Id
    val id: UUID,

    @Column
    val name: String,
)
