package app.dldzl.career.server.service.career

import app.dldzl.career.server.controller.career.model.CareerResponse
import app.dldzl.career.server.domain.career.entity.Career
import app.dldzl.career.server.domain.career.repository.CareerJpaRepository
import app.dldzl.career.server.domain.careertype.repository.CareerTypeJpaRepository
import java.util.UUID
import kotlin.jvm.optionals.getOrElse
import kotlin.jvm.optionals.getOrNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CareerService(
    @Autowired private val careerJpaRepository: CareerJpaRepository,
    @Autowired private val careerTypeJpaRepository: CareerTypeJpaRepository,
) {
    fun createCareer(
        careerTypeId: UUID,
        name: String,
    ): Career {
        val careerType = careerTypeJpaRepository.findById(careerTypeId).getOrElse { throw IllegalStateException() }

        return careerJpaRepository.save(
            Career(
                careerType = careerType,
                name = name,
            ),
        )
    }

    fun getAllCareers(): List<Career> = careerJpaRepository.findAll()

    fun getCareerById(id: UUID): Career? = careerJpaRepository.findById(id).getOrNull()
}
