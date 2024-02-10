package PIRATE_GAME__Constructers_Initializers_Final_Sealed.pirate;

public final class Islander extends Combatant{
    public Islander(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
