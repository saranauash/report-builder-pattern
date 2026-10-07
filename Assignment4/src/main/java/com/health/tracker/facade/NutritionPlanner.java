package com.health.tracker.facade;

public class NutritionPlanner {

    public void logMeal(String mealName, int calories) {
        System.out.println("[NutritionPlanner] Logged meal: " + mealName + " (" + calories + " kcal).");
    }

    public void logWaterIntake(int volumeMl) {
        System.out.println("[NutritionPlanner] Added " + volumeMl + " ml to daily water goal.");
    }

    public boolean isCalorieGoalMet(int targetCalories, int consumedCalories) {
        return consumedCalories <= targetCalories;
    }
}