package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING -> new DrivingTask("Driving", "to Warsaw", "using car");
            case PAINTING -> new PaintingTask("Painting", "blue", "the chair");
            case SHOPPING -> new ShoppingTask("Buy", "t-shirt", 2);
            default -> null;
        };
    }
}
