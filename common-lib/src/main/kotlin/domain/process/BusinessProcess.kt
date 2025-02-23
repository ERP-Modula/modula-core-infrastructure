package domain.process

import java.util.UUID

data class BusinessProcess(
    val id: UUID,
    val name: String,
    val description: String? = null,
    val startNode: Int = 0,
    val nodes: List<ProcessNode>,
    val nodePlacements: Map<UUID, NodePlacement>
)