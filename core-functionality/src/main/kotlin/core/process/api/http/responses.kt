package core.process.api.http

import domain.process.BusinessProcess
import domain.process.NodePlacement
import domain.process.ProcessNode
import java.util.*

data class BusinessProcessResponse(
    private val id: UUID,
    private val name: String,
    private val description: String? = null,
    private val startNode: Int = 0,
    private val nodes: List<ProcessNode>,
    private val nodePlacements: Map<UUID, NodePlacement>
)

fun BusinessProcess.toResponse() = BusinessProcessResponse(
    id = id,
    name = name,
    description = description,
    startNode = startNode,
    nodes = nodes,
    nodePlacements = nodePlacements
)