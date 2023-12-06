package app.dldzl.career.server.domain.careertype.repository

import app.dldzl.career.server.domain.careertype.entity.CareerType
import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface CareerTypeJpaRepository : JpaRepository<CareerType, UUID>
