package patterns;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BusinessProcessPattern {
    private UUID uuid;
    private String name;
    private String description;
    private List<Module> modulesIncluded;
//    private List<BusinessProcess> businessProcesses;
}

//    private val uuid: UUID,
//private val name: String,
//private val description: String,
//private val modulesIncluded: List<Module>,
//private val businessProcesses: List<BusinessProcess>
