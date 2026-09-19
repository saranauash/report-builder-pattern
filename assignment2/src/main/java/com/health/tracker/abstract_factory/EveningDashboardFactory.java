package com.health.tracker.abstract_factory;

public class EveningDashboardFactory implements DashboardWidgetFactory {
    @Override
    public HeaderWidget createHeaderWidget() {
        return new EveningHeader();
    }

    @Override
    public TrackerWidget createTrackerWidget() {
        return new EveningTrackerWidget();
    }
}