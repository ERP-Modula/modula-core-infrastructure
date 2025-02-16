package core.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfig {
    @Bean
    fun topic1(): NewTopic = TopicBuilder.name("module_task_produce")
        .partitions(1).replicas(1).build()

    @Bean
    fun topic2(): NewTopic = TopicBuilder.name("module_task_consume")
        .partitions(1).replicas(1).build()

    @Bean
    fun topic3(): NewTopic = TopicBuilder.name("module_data_request")
        .partitions(1).replicas(1).build()

    @Bean
    fun topic4(): NewTopic = TopicBuilder.name("module_data_produce")
        .partitions(1).replicas(1).build()
}