package com.health.tracker.facade;

public class HealthTrackerFacade {

    private final ActivityTracker activityTracker;
    private final NutritionPlanner nutritionPlanner;
    private final SleepMonitor sleepMonitor;

    public HealthTrackerFacade() {
        this.activityTracker = new ActivityTracker();
        this.nutritionPlanner = new NutritionPlanner();
        this.sleepMonitor = new SleepMonitor();
    }

    public void logFullDayRoutine(double sleepHours, String sleepQuality,
                                  String workoutType, int workoutMinutes,
                                  String mainMeal, int mealCalories, int waterMl) {
        System.out.println("=== Starting Daily Health Routine Logging ===");

        sleepMonitor.recordSleep(sleepHours, sleepQuality);
        activityTracker.trackWorkout(workoutType, workoutMinutes);
        nutritionPlanner.logMeal(mainMeal, mealCalories);
        nutritionPlanner.logWaterIntake(waterMl);

        System.out.println("=== Daily Routine Successfully Logged ===\n");
    }

    public void generateDailyHealthCheckup(double sleepHours, int consumedCalories, int targetCalories) {
        System.out.println("=== Express Daily Health Checkup ===");

        boolean goodSleep = sleepMonitor.isSleepSufficient(sleepHours);
        boolean goodNutrition = nutritionPlanner.isCalorieGoalMet(targetCalories, consumedCalories);

        System.out.println("1. Sleep goal met: " + (goodSleep ? "YES" : "NO"));
        System.out.println("2. Calorie limit respected: " + (goodNutrition ? "YES" : "NO"));
        System.out.println("===================================\n");
    }
}