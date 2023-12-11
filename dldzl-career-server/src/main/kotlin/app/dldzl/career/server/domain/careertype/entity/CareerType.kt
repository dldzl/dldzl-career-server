package app.dldzl.career.server.domain.careertype.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID
import org.hibernate.annotations.UuidGenerator

@Entity(name = "tbl_career_types")
class CareerType(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    val id: UUID = UUID.randomUUID(),

    @Column(length = 128)
    val title: String,
)
