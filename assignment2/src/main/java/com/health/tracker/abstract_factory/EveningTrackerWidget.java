package com.health.tracker.abstract_factory;

public class EveningTrackerWidget implements TrackerWidget {
    @Override
    public void renderCard() {
        System.out.println("🛌 [Evening Widget]: Sleep analysis and 15 minutes of pre-bed meditation.");
    }
}