package Interface;

enum UsageType{ENTERTAINMENT,RESIDENTIAL,GOVERNMENT,SPORTS}
public class Building implements Mappable{

    private String name;
    private UsageType usage;
    Building type;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }



    @Override
    public String getLabel() {
        return name + "("+ usage+ ")";
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case SPORTS -> Color.WHITE + " " + PointMarkers.PUSH_PIN;
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case RESIDENTIAL -> Color.BLUE + " "+ PointMarkers.DIAMOND;
            default -> Color.BLACK + " "+ PointMarkers.CIRCLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name,usage);
    }
}
