package Collection_AdventureGame_HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String myLocations = """        
                lake,at the edge of Lake Hale,E:ocean,W:forest,S:well house,N:cave
                ocean,on Hale's beach before an angry sea,W:lake
                cave,at the mouth of Hale's bat cave,E:ocean,W:forest,S:lake
                """;

        AdventureGame game = new AdventureGame(myLocations);
        game.play("lake");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;
            game.move(direction);
        }
    }
}
