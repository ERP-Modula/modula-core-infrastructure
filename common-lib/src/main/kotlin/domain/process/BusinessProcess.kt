package domain.process


data class BusinessProcess(
    private val id: String,
    private val description: String? = null,
    private val startNode: Int = 0,
    private val nodes: List<ProcessNode>
)