package core.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic coreToModulaDataTopic() {
        return TopicBuilder.name("core-to-modula-data").build();
    }

    @Bean
    public NewTopic coreToModulaTasksTopic() {
        return TopicBuilder.name("core-to-modula-tasks").build();
    }

    @Bean
    public NewTopic modulaToCoreDataTopic() {
        return TopicBuilder.name("modula-to-core-data").build();
    }

    @Bean
    public NewTopic modulaToCoreTasksTopic() {
        return TopicBuilder.name("modula-to-core-tasks").build();
    }
}
