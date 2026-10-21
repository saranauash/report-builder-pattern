package com.health.tracker.visitor;

public class Workout implements HealthElement {
    private final String activityName;
    private final int durationMinutes;
    private final int burnedCalories;

    public Workout(String activityName, int durationMinutes, int burnedCalories) {
        this.activityName = activityName;
        this.durationMinutes = durationMinutes;
        this.burnedCalories = burnedCalories;
    }

    @Override
    public void accept(HealthVisitor visitor) {
        visitor.visitWorkout(this);
    }

    public String getActivityName() { return activityName; }
    public int getDurationMinutes() { return durationMinutes; }
    public int getBurnedCalories() { return burnedCalories; }
}