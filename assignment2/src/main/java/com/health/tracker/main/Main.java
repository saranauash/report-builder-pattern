package com.health.tracker.main;

import com.health.tracker.factory_method.*;
import com.health.tracker.abstract_factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DEMO: FACTORY METHOD PATTERN (HEALTH)  ");
        System.out.println("==========================================");

        HabitFactory waterFactory = new WaterHabitFactory();
        waterFactory.startHabitTracking();

        System.out.println();

        HabitFactory workoutFactory = new WorkoutHabitFactory();
        workoutFactory.startHabitTracking();

        System.out.println("\n==========================================");
        System.out.println(" DEMO: ABSTRACT FACTORY PATTERN (HEALTH) ");
        System.out.println("==========================================");

        System.out.println("\n--- Displaying Morning Dashboard ---");
        DashboardWidgetFactory morningFactory = new MorningDashboardFactory();
        HealthDashboardApp morningApp = new HealthDashboardApp(morningFactory);
        morningApp.renderDashboard();

        System.out.println("\n--- Displaying Evening Dashboard ---");
        DashboardWidgetFactory eveningFactory = new EveningDashboardFactory();
        HealthDashboardApp eveningApp = new HealthDashboardApp(eveningFactory);
        eveningApp.renderDashboard();
    }
}