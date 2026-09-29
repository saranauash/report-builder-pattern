package com.health.tracker.bridge;

public class PushSender implements NotificationSender {
    @Override
    public void sendMessage(String title, String body) {
        System.out.println("[PUSH NOTIFICATION]");
        System.out.println("Title: " + title);
        System.out.println("Body:  " + body);
        System.out.println("Status: Sent via Push Service\n");
    }
}