package core.process.api.repository;

import domain.process.BusinessProcess;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface BusinessProcessRepository extends CassandraRepository<BusinessProcess, UUID> {
}
