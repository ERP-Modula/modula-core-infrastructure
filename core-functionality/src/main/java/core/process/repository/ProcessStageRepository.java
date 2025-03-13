package core.process.repository;

import core.process.domain.entity.ProcessStage;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProcessStageRepository extends CassandraRepository<ProcessStage, UUID> {

    // Пример метода, чтобы искать все этапы по processId
    List<ProcessStage> findByProcessId(UUID processId);
}
