package core.process.api.http

import core.process.domain.BusinessProcessService
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/processes")
class BusinessProcessController(
    private val businessProcessService: BusinessProcessService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createGroup(
        @RequestBody @Validated request: CreateBusinessProcessRequest,
    ): BusinessProcessResponse = businessProcessService.createBusinessProcess(request).toResponse()

}