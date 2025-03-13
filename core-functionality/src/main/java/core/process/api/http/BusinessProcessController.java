package core.process.api.http;

import core.process.api.BusinessProcessService;
import domain.process.BusinessProcess;
import domain.process.ProcessNode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/processes")
@RequiredArgsConstructor
public class BusinessProcessController {

    private final BusinessProcessService businessProcessService;

    @PostMapping
    public ResponseEntity<BusinessProcess> createBusinessProcess(@RequestBody BusinessProcess businessProcess) {
        BusinessProcess createdProcess = businessProcessService.createBusinessProcess(businessProcess);
        return ResponseEntity.ok(createdProcess);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusinessProcess> getBusinessProcess(@PathVariable UUID id) {
        Optional<BusinessProcess> process = businessProcessService.getBusinessProcess(id);
        return process.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/nodes")
    public ResponseEntity<ProcessNode> addProcessNode(@PathVariable UUID id, @RequestBody ProcessNode processNode) {
        ProcessNode createdNode = businessProcessService.addProcessNode(id, processNode);
        return ResponseEntity.ok(createdNode);
    }

    @PutMapping("/nodes/{nodeId}")
    public ResponseEntity<ProcessNode> updateProcessNode(@PathVariable String nodeId, @RequestBody ProcessNode updatedNode) {
        try {
            ProcessNode updated = businessProcessService.updateProcessNode(nodeId, updatedNode);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/nodes")
    public ResponseEntity<List<ProcessNode>> getProcessNodes(@PathVariable UUID id) {
        List<ProcessNode> nodes = businessProcessService.getProcessNodes(id);
        return ResponseEntity.ok(nodes);
    }
}
