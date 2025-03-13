package domain.process;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Table("business_processes")
public class BusinessProcess {
    @PrimaryKey
    private UUID id;

    private String name;
    private String description;
    private Integer startNode;
    private List<ProcessNode> nodes;
    private Map<UUID, NodePlacement> nodePlacements;
}

//data class BusinessProcess(
//    val id: UUID,
//    val name: String,
//    val description: String? = null,
//    val startNode: Int = 0,
//    val nodes: List<ProcessNode>,
//    val nodePlacements: Map<UUID, NodePlacement>
//)
