package core.process.service;

import core.process.domain.entity.ProcessStage;
import core.process.repository.ProcessStageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProcessStageService {

    private final ProcessStageRepository repository;

    @Autowired
    public ProcessStageService(ProcessStageRepository repository) {
        this.repository = repository;
    }

    /**
     * Создаёт новый этап в бизнес-процессе.
     */
    public ProcessStage createStage(UUID processId, String name, String status) {
        ProcessStage stage = new ProcessStage(
                UUID.randomUUID(),
                processId,
                name,
                status
        );
        return repository.save(stage);
    }

    /**
     * Возвращает все этапы по ID бизнес-процесса.
     */
    public List<ProcessStage> getStagesByProcessId(UUID processId) {
        return repository.findByProcessId(processId);
    }
}
