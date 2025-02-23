package domain

import domain.trigger.Trigger
import java.util.UUID

data class Module(
    val id: UUID,
    val uniqueName: String,
    val api: List<Api>,
    val triggers: List<Trigger>
) {
    override fun hashCode() = id.hashCode()
    override fun equals(other: Any?): Boolean {
        if (other !is Module) return false
        return id == other.id && uniqueName == other.uniqueName
    }

}