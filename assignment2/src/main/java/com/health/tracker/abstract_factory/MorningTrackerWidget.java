package com.health.tracker.abstract_factory;

public class MorningTrackerWidget implements TrackerWidget {
    @Override
    public void renderCard() {
        System.out.println("☀️ [Morning Widget]: 10-minute morning stretch and a glass of lemon water.");
    }
}