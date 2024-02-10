package PIRATE_GAME__Constructers_Initializers_Final_Sealed;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}
