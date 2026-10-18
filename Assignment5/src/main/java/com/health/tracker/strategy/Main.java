package com.health.tracker.strategy;

public class Main {
    public static void main(String[] args) {
        int bmr = 1750;
        double activity = 1.55;

        NutritionContext context = new NutritionContext(new MaintenanceStrategy());
        System.out.println("Daily Target: " + context.executeCalculation(bmr, activity) + " kcal\n");

        context.setStrategy(new WeightLossStrategy());
        System.out.println("Daily Target: " + context.executeCalculation(bmr, activity) + " kcal\n");

        context.setStrategy(new MuscleGainStrategy());
        System.out.println("Daily Target: " + context.executeCalculation(bmr, activity) + " kcal");
    }
}