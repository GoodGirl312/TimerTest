package com.RabbitMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author ys
 * @Description
 * @Date 2019/4/18 14:25
 */
public class SendeMessage {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.newConnection();

            Channel channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            for (int i = 20; i >0; i--) {
                String message = "第" + i + "条消息。";
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println("[x] Sent'" + message + "'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
