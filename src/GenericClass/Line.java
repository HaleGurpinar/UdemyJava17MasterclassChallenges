package GenericClass;

public abstract class Line implements Mappable{
    private double[][] locations;
    public Line(String... locations){
        this.locations=new double[locations.length][];
        int index=0;
        for (var l: locations){
            this.locations[index++]=Mappable.stringToLatLon(l);
        }
    }
    private String locations(){

        return "";
    }



    @Override
    public void render() {

    }
}
