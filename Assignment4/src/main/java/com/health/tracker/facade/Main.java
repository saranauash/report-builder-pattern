package com.health.tracker.facade;

public class Main {

    public static void main(String[] args) {
        HealthTrackerFacade healthTracker = new HealthTrackerFacade();

        // 1. Log whole day routine via single Facade call
        healthTracker.logFullDayRoutine(
                7.5, "Excellent",
                "Running", 30,
                "Chicken Rice Bowl", 550,
                2000
        );

        // 2. Perform quick health goal checkup
        healthTracker.generateDailyHealthCheckup(7.5, 2100, 2200);
    }
}