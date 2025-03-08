package domain.process;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
public class ProcessNode {
    private String id;
    private UUID localId;
    private ProcessNode previousNode;
    private List<ProcessNode> nextNodes;
    private NodeType nodeType;
    private String source;
    private String sourceActionId;
    private Map<String, String> actionConfiguration;
}

