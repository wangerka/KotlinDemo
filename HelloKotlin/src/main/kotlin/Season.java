public class Season {
    private final String name;
    
    private Season(String name){
        this.name = name;
    }
    
    public static final Season SPRING = new Season("SPRING");
    public static final Season SUMMER = new Season("SUMMER");
    public static final Season AUTUMN = new Season("AUTUMN");
    public static final Season WINTER = new Season("WINTER");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
