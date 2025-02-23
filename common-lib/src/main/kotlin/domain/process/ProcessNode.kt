package domain.process

import java.util.UUID

data class ProcessNode(
    val id: String,
    val localId: UUID,
    val previousNode: ProcessNode?,
    val nextNodes: List<ProcessNode>,
    val nodeType: NodeType,
    val source: String,
    val sourceActionId: String,
    val actionConfiguration: Map<String, String>
)
