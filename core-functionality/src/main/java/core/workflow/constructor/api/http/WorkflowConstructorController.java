package core.workflow.constructor.api.http;


import core.workflow.constructor.core.ModuleConfigurationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import core.workflow.constructor.domain.entity.Module;

import java.util.List;


@RestController
@RequestMapping("api/v1/workflow-constructor")
@RequiredArgsConstructor
public class WorkflowConstructorController {

    private final ModuleConfigurationService moduleConfigurationService;

    @GetMapping("/modules")
    public List<Module> getAvailableModules() {
        return moduleConfigurationService.getAvailableModules();
    }
}
