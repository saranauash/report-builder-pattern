package com.health.tracker.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HealthElement> dailyLog = new ArrayList<>();
        dailyLog.add(new Meal("Oatmeal with berries", 350, 12.0, 5.0, 60.0));
        dailyLog.add(new Workout("Morning Jog", 30, 250));
        dailyLog.add(new Meal("Chicken Breast with Rice", 600, 45.0, 8.0, 50.0));
        dailyLog.add(new Workout("Evening Strength Training", 45, 320));

        CalorieAuditVisitor auditVisitor = new CalorieAuditVisitor();
        for (HealthElement element : dailyLog) {
            element.accept(auditVisitor);
        }

        System.out.println("=== CALORIE AUDIT REPORT ===");
        System.out.println("Gained Calories: " + auditVisitor.getTotalGainedCalories());
        System.out.println("Burned Calories: " + auditVisitor.getTotalBurnedCalories());
        System.out.println("Net Calorie Balance: " + auditVisitor.getNetCalories() + " kcal\n");

        HealthReportExportVisitor exportVisitor = new HealthReportExportVisitor();
        for (HealthElement element : dailyLog) {
            element.accept(exportVisitor);
        }

        System.out.println("=== DAILY LOG EXPORT ===");
        System.out.print(exportVisitor.getExportedReport());
    }
}