package com.health.tracker.bridge;

public class TelegramSender implements NotificationSender {
    @Override
    public void sendMessage(String title, String body) {
        System.out.println("[TELEGRAM BOT MESSAGE]");
        System.out.println("Title: " + title);
        System.out.println("Body:  " + body);
        System.out.println("Status: Sent via Telegram API\n");
    }
}