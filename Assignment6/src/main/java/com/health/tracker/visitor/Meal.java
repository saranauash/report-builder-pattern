package com.health.tracker.visitor;

public class Meal implements HealthElement {
    private final String name;
    private final int calories;
    private final double proteins;
    private final double fats;
    private final double carbs;

    public Meal(String name, int calories, double proteins, double fats, double carbs) {
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    @Override
    public void accept(HealthVisitor visitor) {
        visitor.visitMeal(this);
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public double getProteins() { return proteins; }
    public double getFats() { return fats; }
    public double getCarbs() { return carbs; }
}