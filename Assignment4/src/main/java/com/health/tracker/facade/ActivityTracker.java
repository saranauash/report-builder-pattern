package com.health.tracker.facade;

public class ActivityTracker {

    public void trackWorkout(String workoutType, int durationMinutes) {
        int caloriesBurned = durationMinutes * 7;
        System.out.println("[ActivityTracker] Logged workout: " + workoutType +
                " (" + durationMinutes + " mins). Burned: " + caloriesBurned + " kcal.");
    }

    public int getTodayWorkoutDuration() {
        return 45;
    }
}