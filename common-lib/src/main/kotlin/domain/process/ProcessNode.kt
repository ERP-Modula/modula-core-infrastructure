package domain.process

data class ProcessNode(
    private val id: String,
    private val previousNode: ProcessNode?,
    private val nextNodes: List<ProcessNode>,
    private val nodeType: NodeType,
    private val source: String,
    private val sourceActionId: String,
    private val actionConfiguration: Map<String, String>
)
