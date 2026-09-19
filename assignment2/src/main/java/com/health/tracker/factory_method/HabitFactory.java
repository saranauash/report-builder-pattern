package com.health.tracker.factory_method;

public abstract class HabitFactory {
    public abstract Habit createHabit();

    public void startHabitTracking() {
        Habit habit = createHabit();
        System.out.println("--- Starting Habit Tracker ---");
        System.out.println(habit.getDetails());
        habit.trackProgress();
    }
}