import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");


    public FirePokemon(String name, int level, int hp, String food, String call) {
        super(name, level, hp, food, call, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Fire Lash", 10);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Flame Thrower", 8);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Pyro Ball", 12);
    }

    void inferno(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Inferno", 14);
    }
}
