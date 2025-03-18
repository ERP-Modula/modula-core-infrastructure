package core.process.api.services;

import core.process.api.repository.BusinessProcessRepository;
import domain.process.BusinessProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BusinessProcessService {

    @Autowired
    BusinessProcessRepository repository;

    public BusinessProcess createBusinessProcess(BusinessProcess businessProcess) {
        return repository.save(businessProcess);
    }

    public BusinessProcess getBusinessProcess(UUID id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Business process with id " + id + " not found"));
    }

    public List<BusinessProcess> getAllBusinessProcesses() {
        return repository.findAll();
    }
}
