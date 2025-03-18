package core.process.api.repository;

import domain.process.BusinessProcess;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;


public interface BusinessProcessRepository extends CassandraRepository<BusinessProcess, UUID> {
}
