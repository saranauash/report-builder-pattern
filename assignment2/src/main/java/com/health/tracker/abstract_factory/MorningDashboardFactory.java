package com.health.tracker.abstract_factory;

public class MorningDashboardFactory implements DashboardWidgetFactory {
    @Override
    public HeaderWidget createHeaderWidget() {
        return new MorningHeader();
    }

    @Override
    public TrackerWidget createTrackerWidget() {
        return new MorningTrackerWidget();
    }
}