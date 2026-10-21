package com.health.tracker.visitor;

public class CalorieAuditVisitor implements HealthVisitor {
    private int totalGainedCalories = 0;
    private int totalBurnedCalories = 0;

    @Override
    public void visitMeal(Meal meal) {
        totalGainedCalories += meal.getCalories();
    }

    @Override
    public void visitWorkout(Workout workout) {
        totalBurnedCalories += workout.getBurnedCalories();
    }

    public int getNetCalories() {
        return totalGainedCalories - totalBurnedCalories;
    }

    public int getTotalGainedCalories() {
        return totalGainedCalories;
    }

    public int getTotalBurnedCalories() {
        return totalBurnedCalories;
    }
}