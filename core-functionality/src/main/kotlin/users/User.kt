package users

import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

//data class User(): UserDetails
@Table("users")
data class User(
    private val uuid: UUID,
    private val username: String,
    private val roles: Set<String>
)