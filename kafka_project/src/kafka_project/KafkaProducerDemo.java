package kafka_project;

public class KafkaProducerDemo {
public static final String TOPIC = "testTopic";
    
    public static void main(String[] args) {
        boolean isAsync = false;
        sampleProducer producerThread = new sampleProducer(TOPIC, isAsync);
        // start the producer
        producerThread.start();
 
    }

}
