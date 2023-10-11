package GenericClass;

public class Main {
    public static void main(String[] args) {


        var nationalParks= new Park[]{
                new Park("Yellowstone ","44.4882, -110.5916"),
                new Park("Grand Canyon ", "36.1085, -112.0965"),
                new Park("Yosemite ", "37.8865, -119.2431")
        };

        Layer<Park> parkLayer= new Layer<>(nationalParks);
        parkLayer.renderLayer();

        var majorRivers=new River[]{
                new River("Mississipi ",
                        "47.2315, -95.1240","29.4788, -89.2475","47.2312, -95.1243"),
                new River("Misouri ",
                        "47.2317, -95.1249","29.4782, -89.2477","47.2319, -95.1244")
        };

          Layer<River> riverLayer=new Layer<>(majorRivers);
        riverLayer.addElement(
                new River("Colarado","49.231, -75.124","39.478, -79.247"),
                new River("Delaware ","43.231, -55.124","49.478, -69.247")
        );
        riverLayer.renderLayer();
    }
}
