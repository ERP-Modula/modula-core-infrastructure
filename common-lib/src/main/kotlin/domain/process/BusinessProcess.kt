package domain.process

import java.util.UUID


data class BusinessProcess(
    private val id: String,
    private val description: String? = null,
    private val startNode: Int = 0,
    private val nodes: List<ProcessNode>,
    private val nodePlacements: Map<UUID, NodePlacement>
)