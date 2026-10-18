package com.health.tracker.strategy;

public class NutritionContext {
    private CalorieStrategy strategy;

    public NutritionContext(CalorieStrategy initialStrategy) {
        this.strategy = initialStrategy;
    }

    public void setStrategy(CalorieStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeCalculation(int baseMetabolism, double activityMultiplier) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set!");
        }
        System.out.println("Applying strategy: " + strategy.getStrategyName());
        return strategy.calculateDailyGoal(baseMetabolism, activityMultiplier);
    }
}