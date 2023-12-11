package app.dldzl.career.server.controller.career

import app.dldzl.career.server.controller.career.model.CareerResponse
import app.dldzl.career.server.controller.career.model.CreateCareerRequest
import app.dldzl.career.server.controller.career.model.toResponse
import app.dldzl.career.server.service.career.CareerService
import java.util.UUID
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/careers")
class CareerController(
    @Autowired private val careerService: CareerService,
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCareer(
        @RequestBody req: CreateCareerRequest,
    ): CareerResponse = careerService.createCareer(
        careerTypeId = req.careerTypeId,
        name = req.title,
    ).toResponse()

    @GetMapping
    fun getCareers(): List<CareerResponse> = careerService.getAllCareers().toResponse()

    @GetMapping("/id")
    fun getCareerById(
        @RequestParam(name = "career_id") careerId: UUID,
    ): CareerResponse? = careerService.getCareerById(id = careerId)?.toResponse()
}
