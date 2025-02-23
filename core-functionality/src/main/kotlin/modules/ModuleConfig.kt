package modules

import domain.Module
import org.springframework.data.cassandra.core.mapping.Table
import spaces.Space

@Table
data class ModuleConfig(
    private val space: Space,
    private val config: Map<Module, Map<String, String>>
)