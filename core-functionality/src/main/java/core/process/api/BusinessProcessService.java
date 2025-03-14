package core.process.api;

import core.process.api.repository.BusinessProcessRepository;
import core.process.api.repository.ProcessNodeRepository;
import domain.process.BusinessProcess;
import domain.process.ProcessNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BusinessProcessService {
    private final BusinessProcessRepository businessProcessRepository;
    private final ProcessNodeRepository processNodeRepository;

    public BusinessProcess createBusinessProcess(BusinessProcess businessProcess) {
        return businessProcessRepository.save(businessProcess);
    }

    public Optional<BusinessProcess> getBusinessProcess(UUID id) {
        return businessProcessRepository.findById(id);
    }

    public ProcessNode addProcessNode(UUID processId, ProcessNode processNode) {
        processNode.setId(UUID.randomUUID());
        processNode.setLocalId(processId);
        return processNodeRepository.save(processNode);
    }

    public ProcessNode updateProcessNode(String nodeId, ProcessNode updatedNode) {
        Optional<ProcessNode> existingNode = processNodeRepository.findById(nodeId);
        if (existingNode.isPresent()) {
            ProcessNode node = existingNode.get();
            node.setNodeType(updatedNode.getNodeType());
            node.setSource(updatedNode.getSource());
            node.setSourceActionId(updatedNode.getSourceActionId());
            node.setActionConfiguration(updatedNode.getActionConfiguration());
            return processNodeRepository.save(node);
        }
        throw new RuntimeException("Node with ID " + nodeId + " not found");
    }

    public List<ProcessNode> getProcessNodes(UUID processId) {
        return processNodeRepository.findById(processId);
    }
}
