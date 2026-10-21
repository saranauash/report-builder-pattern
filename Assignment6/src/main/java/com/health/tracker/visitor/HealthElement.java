package com.health.tracker.visitor;

public interface HealthElement {
    void accept(HealthVisitor visitor);
}