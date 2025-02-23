package patterns

import domain.Module
import domain.process.BusinessProcess
import java.util.UUID

data class BusinessProcessPattern(
    private val uuid: UUID,
    private val name: String,
    private val description: String,
    private val modulesIncluded: List<Module>,
    private val businessProcesses: List<BusinessProcess>
)
