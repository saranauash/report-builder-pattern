package com.health.tracker.abstract_factory;

public class HealthDashboardApp {
    private final HeaderWidget headerWidget;
    private final TrackerWidget trackerWidget;

    public HealthDashboardApp(DashboardWidgetFactory factory) {
        this.headerWidget = factory.createHeaderWidget();
        this.trackerWidget = factory.createTrackerWidget();
    }

    public void renderDashboard() {
        headerWidget.renderHeader();
        trackerWidget.renderCard();
    }
}