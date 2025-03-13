package core.process.api.repository;

import domain.process.ProcessNode;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface ProcessNodeRepository extends CassandraRepository<ProcessNode, String> {
    List<ProcessNode> findByProcessId(UUID processId);
}
