package com.health.tracker.visitor;

public interface HealthVisitor {
    void visitMeal(Meal meal);
    void visitWorkout(Workout workout);
}