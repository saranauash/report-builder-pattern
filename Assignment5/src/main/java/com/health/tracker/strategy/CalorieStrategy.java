package com.health.tracker.strategy;

public interface CalorieStrategy {
    int calculateDailyGoal(int baseMetabolism, double activityMultiplier);
    String getStrategyName();
}