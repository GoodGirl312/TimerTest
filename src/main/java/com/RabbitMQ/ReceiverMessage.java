package com.RabbitMQ;

import com.rabbitmq.client.*;

/**
 * @author ys
 * @Description
 * @Date 2019/4/18 14:39
 */
public class ReceiverMessage {
    private final static String QUEUE_NAME = "hello";

    public static void receiveMessage() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            Connection connection = factory.newConnection();

            Channel channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            DeliverCallback deliverCallback = (String consumerTag, Delivery delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println("[x] Received'" + message + "'");
                try {
                    doWork(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
                }
            };
            boolean autoAck = true;
            channel.basicConsume(QUEUE_NAME, autoAck, deliverCallback, consumerTag -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doWork(String task) throws InterruptedException {
        for (char ch : task.toCharArray()) {
            if (ch == '。') {
                System.out.println("接收任务处理中");
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println("[*] 等待消息。退出按CTRL + C");
        receiveMessage();
    }
}
