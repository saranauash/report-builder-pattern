package com.health.tracker.factory_method;

public class WaterHabit implements Habit {
    private int currentVolumeMl = 0;
    private final int targetVolumeMl = 2000;

    @Override
    public void trackProgress() {
        currentVolumeMl += 250;
        System.out.println("[Water Tracker] Added 250 ml. Total: " + currentVolumeMl + "/" + targetVolumeMl + " ml.");
    }

    @Override
    public String getDetails() {
        return "Water Target: " + targetVolumeMl + " ml per day.";
    }
}