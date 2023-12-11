package app.dldzl.career.server.service.careertype

import app.dldzl.career.server.domain.careertype.entity.CareerType
import app.dldzl.career.server.domain.careertype.repository.CareerTypeJpaRepository
import java.util.UUID
import kotlin.jvm.optionals.getOrNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CareerTypeService(
    @Autowired private val careerTypeJpaRepository: CareerTypeJpaRepository,
) {
    fun createCareerType(title: String): CareerType = careerTypeJpaRepository.save(
        CareerType(
            title = title,
        ),
    )

    fun getAllCareerTypes(): List<CareerType> = careerTypeJpaRepository.findAll()

    fun getCareerTypeById(id: UUID): CareerType? = careerTypeJpaRepository.findById(id).getOrNull()
}
