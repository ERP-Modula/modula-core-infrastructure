package core.workflow.constructor.core;

import core.workflow.constructor.domain.entity.Module;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ModuleConfigurationService {

    private final RestTemplate restTemplate;
    //это нужно куда то вынести
    private final static List<String> availableModules = List.of("google-docs");
    private final static Map<String, String> modulesToUrls = Map.ofEntries(
      Map.entry("google-docs", "http://localhost:8080")
    );

    public List<Module> getAvailableModules() {
        List<Module> modules = new ArrayList<>();

        for ( String moduleServiceName: availableModules) {
            Module module = restTemplate.getForObject(
                    getServiceUrl(moduleServiceName),
                    Module.class
                    );
            modules.add(module);
        }

        return modules;
    }

    /**
     * т.к. модули будут писаться по определенному стандарту, будут существовать
     * требования по формату их API, поэтому теоретически в урле меняться
     * может только имя
     */
    private String getServiceUrl(String serviceName) {
        return String.format("%s/api/v1/module", modulesToUrls.get(serviceName));
    }
}
