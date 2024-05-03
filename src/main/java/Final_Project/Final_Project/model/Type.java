package Final_Project.Final_Project.model;

public enum Type {
    //mixed, roses, lilies, tulips, daiseies
    MIXED, ROSES, LILIES, TULIPS, DAISIES;

    public String toString(){
        return switch (this) {
            case MIXED -> "Mixed";
            case ROSES -> "Roses";
            case LILIES -> "Lilies";
            case TULIPS -> "Tulips";
            case DAISIES -> "Daisies";
            default -> "Unknown";
        };
    }
    public static Type fromString(String s){
        return switch (s) {
            case "Mixed" -> MIXED;
            case "Roses" -> ROSES;
            case "Lilies" -> LILIES;
            case "Tulips" -> TULIPS;
            case "Daisies" -> DAISIES;
            default -> null;
        };
    }
}


