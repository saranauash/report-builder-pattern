package com.health.tracker.bridge;

public class WaterReminder extends HabitNotification {
    private final int targetVolumeMl;

    public WaterReminder(NotificationSender sender, int targetVolumeMl) {
        super(sender);
        this.targetVolumeMl = targetVolumeMl;
    }

    @Override
    public void sendNotification() {
        String title = "Hydration Reminder";
        String body = "Time to drink water! Daily goal target: " + targetVolumeMl + " ml.";
        sender.sendMessage(title, body);
    }
}