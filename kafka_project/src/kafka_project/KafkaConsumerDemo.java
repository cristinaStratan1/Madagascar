package kafka_project;

public class KafkaConsumerDemo {
    public static void main(String[] args) {
        SampleConsumer consumerThread = new SampleConsumer("hello-mqtt-kafka");
        consumerThread.start();
    }
}