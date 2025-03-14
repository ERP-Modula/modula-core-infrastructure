package domain.process;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Table("process_nodes")
public class ProcessNode {
    @PrimaryKey
    private UUID id;

    private UUID localId;
    private ProcessNode previousNode;
    private List<ProcessNode> nextNodes;
    private NodeType nodeType;
    private String source;
    private String sourceActionId;
    private Map<String, String> actionConfiguration;
}

