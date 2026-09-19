package com.health.tracker.abstract_factory;

public class EveningHeader implements HeaderWidget {
    @Override
    public void renderHeader() {
        System.out.println("🌙 [Evening Header]: Good evening! Time to reflect and unwind.");
    }
}