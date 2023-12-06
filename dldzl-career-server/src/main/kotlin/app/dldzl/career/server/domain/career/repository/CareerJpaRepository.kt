package app.dldzl.career.server.domain.career.repository

import app.dldzl.career.server.domain.career.entity.Career
import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface CareerJpaRepository : JpaRepository<Career, UUID>
