package core.process.api.http;

import core.process.domain.entity.ProcessStage;
import core.process.service.ProcessStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/process/stages")
public class ProcessStageController {

    private final ProcessStageService stageService;

    @Autowired
    public ProcessStageController(ProcessStageService stageService) {
        this.stageService = stageService;
    }
    @PostMapping
    public ProcessStage createStage(@RequestParam UUID processId,
                                    @RequestParam String name,
                                    @RequestParam String status) {
        return stageService.createStage(processId, name, status);
    }
    @GetMapping("/{processId}")
    public List<ProcessStage> getStagesByProcessId(@PathVariable UUID processId) {
        return stageService.getStagesByProcessId(processId);
    }
}
