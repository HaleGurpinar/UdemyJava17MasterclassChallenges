package Constructers_Initializers_PirateGame;

import Constructers_Initializers_PirateGame.pirate.Pirate;
import Constructers_Initializers_PirateGame.pirate.PirateGame;
import Constructers_Initializers_PirateGame.pirate.Weapon;

public class Main {
    public static void main(String[] args) {
// Constructors Initializers Part -- Pirate Game
//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("weapon = " + weapon +
                           ", hitPoints = " + weapon.getHitPoints() +
                        ", minLevel = " + weapon.getMinLevel());

        var list = Weapon.getWeaponsByLevel(1);
        list.forEach(System.out::println);

        Pirate lily = new Pirate("Lily");
        System.out.println(lily);

        PirateGame.getTowns(0).forEach(System.out::println);
        System.out.println("---------------------------------------");
        PirateGame.getTowns(1).forEach(System.out::println);

        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);
    }
}
