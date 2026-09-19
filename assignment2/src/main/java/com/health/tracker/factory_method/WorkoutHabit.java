package com.health.tracker.factory_method;

public class WorkoutHabit implements Habit {
    private int completedMinutes = 0;
    private final int targetMinutes = 45;

    @Override
    public void trackProgress() {
        completedMinutes += 15;
        System.out.println("[Workout Tracker] Recorded 15 minutes. Total: " + completedMinutes + "/" + targetMinutes + " mins.");
    }

    @Override
    public String getDetails() {
        return "Workout Target: " + targetMinutes + " minutes of active exercise.";
    }
}