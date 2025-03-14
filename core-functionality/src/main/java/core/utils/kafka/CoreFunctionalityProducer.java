package core.utils.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CoreFunctionalityProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public CoreFunctionalityProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendDataToModula(String data) {
        kafkaTemplate.send("core-to-modula-data", data);
    }

    public void sendTaskToModula(String task) {
        kafkaTemplate.send("core-to-modula-tasks", task);
    }
}
