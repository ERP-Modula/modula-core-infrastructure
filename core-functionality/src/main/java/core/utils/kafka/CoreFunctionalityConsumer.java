package core.utils.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CoreFunctionalityConsumer {

    @KafkaListener(topics = "modula-to-core-data", groupId = "core-group")
    public void consumeDataFromModula(String data) {
        System.out.println("Received data from modula: " + data);
        // Process the data
    }

    @KafkaListener(topics = "modula-to-core-tasks", groupId = "core-group")
    public void consumeTaskResultFromModula(String result) {
        System.out.println("Received task result from modula: " + result);
        // Process the task result
    }
}
