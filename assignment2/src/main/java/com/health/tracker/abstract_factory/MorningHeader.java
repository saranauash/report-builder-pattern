package com.health.tracker.abstract_factory;

public class MorningHeader implements HeaderWidget {
    @Override
    public void renderHeader() {
        System.out.println("🌅 [Morning Header]: Good morning! Ready for an energetic day?");
    }
}