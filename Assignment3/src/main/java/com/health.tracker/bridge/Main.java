package com.health.tracker.bridge;

public class Main {
    public static void main(String[] args) {
        NotificationSender pushSender = new PushSender();
        NotificationSender telegramSender = new TelegramSender();

        HabitNotification waterReminder = new WaterReminder(pushSender, 2000);
        waterReminder.sendNotification();

        System.out.println("--> Switching Water Reminder channel to Telegram...\n");
        waterReminder.setSender(telegramSender);
        waterReminder.sendNotification();

        HabitNotification workoutReminder = new WorkoutReminder(telegramSender, "Cardio & Stretching");
        workoutReminder.sendNotification();
    }
}