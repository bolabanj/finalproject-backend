package Final_Project.Final_Project.model;

public enum Occasion {
    MOTHERSDAY, BIRTHDAY, THANKYOU;


    public static Occasion getOccasion(String occasion) {
        return switch (occasion) {
            case "MOTHERSDAY" -> MOTHERSDAY;
            case "BIRTHDAY" -> BIRTHDAY;
            case "THANKYOU" -> THANKYOU;
            default -> null;
        };
    }
    public static String getOccasion(Occasion occasion) {
        return switch (occasion) {
            case MOTHERSDAY -> "MOTHERSDAY";
            case BIRTHDAY -> "BIRTHDAY";
            case THANKYOU -> "THANKYOU";
        };
    }


}
