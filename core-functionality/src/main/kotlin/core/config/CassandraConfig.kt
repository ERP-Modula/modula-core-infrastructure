package core.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories

@Configuration
@EnableCassandraRepositories
class CassandraConfig : AbstractCassandraConfiguration() {
    override fun getKeyspaceName(): String = "my_keyspace"
    override fun getContactPoints(): String = "localhost"
    override fun getPort(): Int = 9042
}