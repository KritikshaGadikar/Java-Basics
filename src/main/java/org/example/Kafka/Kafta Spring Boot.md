# Step-by-Step Guide: Adding Apache Kafka to an Existing Spring Boot Project

## Step 1: Add Kafka Dependencies to `pom.xml`
Edit your `pom.xml` file and add the following dependency:

```xml
<dependencies>
    <!-- Spring Boot Starter for Kafka -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-kafka</artifactId>
    </dependency>
</dependencies>
```

## Step 2: Configure Kafka in `application.yml`
Modify `src/main/resources/application.yml`:

```yaml
spring:
  kafka:
    bootstrap-servers: localhost:9092
    consumer:
      group-id: my-group
      auto-offset-reset: earliest
    producer:
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer
    consumer:
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.apache.kafka.common.serialization.StringDeserializer
```

## Step 3: Create a Kafka Producer
Create a new Java class `KafkaProducer.java` inside your existing project:

```java
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
```

## Step 4: Create a Kafka Consumer
Create `KafkaConsumer.java` in your existing project:

```java
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received Message: " + record.value());
    }
}
```

## Step 5: Create an API to Publish Messages
Modify or add a REST controller in your project to send messages to Kafka:

```java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        kafkaProducer.sendMessage("my-topic", message);
        return "Message sent: " + message;
    }
}
```

## Step 6: Install and Start Kafka Locally
If Kafka is not already installed, follow these steps:

### **Download & Extract Kafka**
1. Download Kafka from [Kafka's official site](https://kafka.apache.org/downloads).
2. Extract the downloaded archive to a preferred location.
3. Navigate to the extracted Kafka directory.

### **Start Zookeeper**
Kafka requires Zookeeper to manage distributed services. Start it with:
```sh
bin/zookeeper-server-start.sh config/zookeeper.properties
```

If you are on Windows, use:
```sh
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

### **Start Kafka Broker**
Once Zookeeper is running, start the Kafka broker:
```sh
bin/kafka-server-start.sh config/server.properties
```

For Windows:
```sh
bin\windows\kafka-server-start.bat config\server.properties
```

### **Create a Kafka Topic**
To create a topic named `my-topic`, run:
```sh
bin/kafka-topics.sh --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

On Windows:
```sh
bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

### **List Existing Topics**
To check if the topic was created successfully:
```sh
bin/kafka-topics.sh --list --bootstrap-server localhost:9092
```

On Windows:
```sh
bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
```

## Step 7: Run Your Spring Boot Application
Start your Spring Boot project using:
```sh
mvn spring-boot:run
```

Then, test the Kafka API by sending a message:
```
http://localhost:8080/kafka/publish?message=HelloKafka
```

## Step 8: Verify Kafka Consumer
To check the messages being received by Kafka, open a new terminal and run:
```sh
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my-topic --from-beginning
```

For Windows:
```sh
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning
```

## Step 9: Check Logs in Spring Boot
Your application logs should show:
```
Received Message: HelloKafka
```

---
Now, Kafka is successfully integrated into your existing Spring Boot project! 🚀 Let me know if you need additional features like retry mechanisms or custom serializers.

