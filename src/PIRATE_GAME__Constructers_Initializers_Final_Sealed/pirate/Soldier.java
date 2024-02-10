package PIRATE_GAME__Constructers_Initializers_Final_Sealed.pirate;

public final class Soldier extends Combatant{
    public Soldier(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
