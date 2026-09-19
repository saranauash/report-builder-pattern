package com.health.tracker.factory_method;

public class WorkoutHabitFactory extends HabitFactory {
    @Override
    public Habit createHabit() {
        return new WorkoutHabit();
    }
}