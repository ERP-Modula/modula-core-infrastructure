package core.process.api.http;

import core.process.api.services.BusinessProcessService;
import domain.process.BusinessProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/processes")
public class BusinessProcessController {

    @Autowired
    private BusinessProcessService businessProcessService;

    @PostMapping
    public ResponseEntity<BusinessProcess> createBusinessProcess(@RequestBody BusinessProcess businessProcess) {
        BusinessProcess createdPattern = businessProcessService.createBusinessProcess(businessProcess);
        return ResponseEntity.ok(createdPattern);
    }

    @GetMapping
    public ResponseEntity<List<BusinessProcess>> getAllBusinessProcesses() {
        List<BusinessProcess> processes = businessProcessService.getAllBusinessProcesses();
        return ResponseEntity.ok(processes);
    }

    @GetMapping("/id")
    public ResponseEntity<BusinessProcess> getBusinessProcessById(@PathVariable UUID id) {
        BusinessProcess processe = businessProcessService.getBusinessProcess(id);
        return ResponseEntity.ok(processe);
    }

}
