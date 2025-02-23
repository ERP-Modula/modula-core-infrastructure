package core.process.domain

import core.process.domain.action.CreateBusinessProcess
import org.springframework.stereotype.Service

@Service
class BusinessProcessService(
    val createBusinessProcess: CreateBusinessProcess
)