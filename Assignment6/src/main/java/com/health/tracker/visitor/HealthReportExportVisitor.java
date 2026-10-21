package com.health.tracker.visitor;

public class HealthReportExportVisitor implements HealthVisitor {
    private final StringBuilder report = new StringBuilder();

    @Override
    public void visitMeal(Meal meal) {
        report.append(String.format("[MEAL] %s: %d kcal (P: %.1fg, F: %.1fg, C: %.1fg)%n",
                meal.getName(), meal.getCalories(), meal.getProteins(), meal.getFats(), meal.getCarbs()));
    }

    @Override
    public void visitWorkout(Workout workout) {
        report.append(String.format("[WORKOUT] %s: %d min, %d kcal burned%n",
                workout.getActivityName(), workout.getDurationMinutes(), workout.getBurnedCalories()));
    }

    public String getExportedReport() {
        return report.toString();
    }
}