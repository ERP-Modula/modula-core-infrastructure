package core.process.domain.action

import core.process.api.http.CreateBusinessProcessRequest
import domain.process.BusinessProcess
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Isolation
import org.springframework.transaction.annotation.Transactional

@Service
class CreateBusinessProcess {
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    operator fun invoke(request: CreateBusinessProcessRequest): BusinessProcess {
        TODO()
    }
}