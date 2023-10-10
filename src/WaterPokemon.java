import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");


    public WaterPokemon(String name, int level, int hp, String food, String call) {
        super(name, level, hp, food, call, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Surf", 12);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Hydro Pump", 16);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Hydro Cannon", 14);
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        if (Objects.equals(enemy.getType(), "electric")) {
            System.out.println("Rain dance has no effect on " + enemy.getName());
            return;
        }

        makeAttack(name, enemy, "Rain Dance", 4);

        if (Objects.equals(enemy.getType(), "grass")) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + " healed 10 hit points due to the effects of Rain Dance!");
        }
    }
}
