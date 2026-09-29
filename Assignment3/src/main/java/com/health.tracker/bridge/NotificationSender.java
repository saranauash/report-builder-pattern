package com.health.tracker.bridge;

public interface NotificationSender {
    void sendMessage(String title, String body);
}