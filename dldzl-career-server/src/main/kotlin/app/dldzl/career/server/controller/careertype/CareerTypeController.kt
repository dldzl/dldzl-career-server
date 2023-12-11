package app.dldzl.career.server.controller.careertype

import app.dldzl.career.server.controller.careertype.model.CareerTypeResponse
import app.dldzl.career.server.controller.careertype.model.toResponse
import app.dldzl.career.server.service.careertype.CareerTypeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/career-types")
class CareerTypeController(
    @Autowired private val careerTypeService: CareerTypeService,
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCareerType(
        @RequestParam("title") title: String,
    ): CareerTypeResponse = careerTypeService.createCareerType(title = title).toResponse()

    @GetMapping
    fun getCareerTypes(): List<CareerTypeResponse> = careerTypeService.getAllCareerTypes().toResponse()
}
