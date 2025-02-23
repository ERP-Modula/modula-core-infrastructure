package spaces

import domain.Module
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

@Table
data class Space(
    private val id: UUID,
    private val name: String,
    private val description: String,
    private val usedModules: List<Module>,
)