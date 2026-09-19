package com.health.tracker.abstract_factory;

public interface DashboardWidgetFactory {
    HeaderWidget createHeaderWidget();
    TrackerWidget createTrackerWidget();
}