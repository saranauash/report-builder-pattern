package com.health.tracker.bridge;

public class WorkoutReminder extends HabitNotification {
    private final String workoutType;

    public WorkoutReminder(NotificationSender sender, String workoutType) {
        super(sender);
        this.workoutType = workoutType;
    }

    @Override
    public void sendNotification() {
        String title = "Workout Reminder";
        String body = "Don't forget your scheduled session: " + workoutType + "!";
        sender.sendMessage(title, body);
    }
}