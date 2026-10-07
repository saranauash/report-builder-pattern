package com.health.tracker.facade;

public class SleepMonitor {

    public void recordSleep(double hours, String quality) {
        System.out.println("[SleepMonitor] Recorded sleep: " + hours + " hrs. Quality: " + quality + ".");
    }

    public boolean isSleepSufficient(double hours) {
        return hours >= 7.0;
    }
}