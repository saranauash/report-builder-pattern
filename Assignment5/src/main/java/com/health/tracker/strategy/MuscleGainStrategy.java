package com.health.tracker.strategy;

public class MuscleGainStrategy implements CalorieStrategy {
    private static final int SURPLUS = 300;

    @Override
    public int calculateDailyGoal(int baseMetabolism, double activityMultiplier) {
        int maintenance = (int) (baseMetabolism * activityMultiplier);
        return maintenance + SURPLUS;
    }

    @Override
    public String getStrategyName() {
        return "Muscle Gain (Caloric Surplus)";
    }
}