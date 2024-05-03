package Final_Project.Final_Project.model;

public enum Color {
    MIXED, RED, YELLOW, GREEN, ORANGE, WHITE;


    public static Color getColor(String color) {
        return switch (color) {
            case "MIXED" -> MIXED;
            case "RED" -> RED;
            case "YELLOW" -> YELLOW;
            case "GREEN" -> GREEN;
            case "ORANGE" -> ORANGE;
            case "WHITE" -> WHITE;
            default -> null;
        };
    }

    public static String getColor(Color color) {
        return switch (color) {
            case MIXED -> "MIXED";
            case RED -> "RED";
            case YELLOW -> "YELLOW";
            case GREEN -> "GREEN";
            case ORANGE -> "ORANGE";
            case WHITE -> "WHITE";
        };
    }
}
