package com.health.tracker.bridge;

public abstract class HabitNotification {
    protected NotificationSender sender; // Мост (Bridge) к каналу отправки

    public HabitNotification(NotificationSender sender) {
        this.sender = sender;
    }

    public void setSender(NotificationSender sender) {
        this.sender = sender; // Динамическая смена реализации во время выполнения
    }

    public abstract void sendNotification();
}