package com.health.tracker.strategy;

public class MaintenanceStrategy implements CalorieStrategy {
    @Override
    public int calculateDailyGoal(int baseMetabolism, double activityMultiplier) {
        return (int) (baseMetabolism * activityMultiplier);
    }

    @Override
    public String getStrategyName() {
        return "Weight Maintenance";
    }
}