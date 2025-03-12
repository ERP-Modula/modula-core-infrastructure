package spaces;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Table
@Data
public class Space {
    private UUID id;
    private String name;
    private String description;
    private List<Module> usedModules;
}

//    private val id: UUID,
//private val name: String,
//private val description: String,
//private val usedModules: List<Module>,