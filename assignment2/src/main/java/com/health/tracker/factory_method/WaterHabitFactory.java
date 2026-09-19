package com.health.tracker.factory_method;

public class WaterHabitFactory extends HabitFactory {
    @Override
    public Habit createHabit() {
        return new WaterHabit();
    }
}