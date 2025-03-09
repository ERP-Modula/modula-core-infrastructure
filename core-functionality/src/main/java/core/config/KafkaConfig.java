//package core.config;
//
//import org.apache.kafka.clients.admin.NewTopic;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.TopicBuilder;
//
//@Configuration
//public class KafkaConfig {
//
//    @Bean
//    public NewTopic topic1() {
//        return TopicBuilder.name("module_task_produce").partitions(1).replicas(1).build();
//    }
//
//    @Bean
//    public NewTopic topic2() {
//        return TopicBuilder.name("module_task_consume").partitions(1).replicas(1).build();
//    }
//
//    @Bean
//    public NewTopic topic3() {
//        return TopicBuilder.name("module_data_request").partitions(1).replicas(1).build();
//    }
//
//    @Bean
//    public NewTopic topic4() {
//        return TopicBuilder.name("module_data_produce").partitions(1).replicas(1).build();
//    }
//}
