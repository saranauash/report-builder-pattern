package com.health.tracker.strategy;

public class WeightLossStrategy implements CalorieStrategy {
    private static final int DEFICIT = 500;

    @Override
    public int calculateDailyGoal(int baseMetabolism, double activityMultiplier) {
        int maintenance = (int) (baseMetabolism * activityMultiplier);
        return Math.max(1200, maintenance - DEFICIT);
    }

    @Override
    public String getStrategyName() {
        return "Weight Loss (Caloric Deficit)";
    }
}