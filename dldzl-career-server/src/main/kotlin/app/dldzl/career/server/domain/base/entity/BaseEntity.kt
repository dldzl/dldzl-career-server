package app.dldzl.career.server.domain.base.entity

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime
import java.util.UUID
import org.hibernate.annotations.UuidGenerator

@MappedSuperclass
abstract class BaseEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    val id: UUID = UUID.randomUUID(),
) : BaseTimeEntity()

@MappedSuperclass
abstract class BaseTimeEntity(

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)
