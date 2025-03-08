package modules;

import org.springframework.data.cassandra.core.mapping.Table;
import spaces.Space;

import java.util.Map;

@Table
public class ModuleConfig {
    private Space space;
    private Map<Module, Map<String, String>> config;
}
