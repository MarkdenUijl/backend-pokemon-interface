import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private static final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String call) {
        super(name, level, hp, food, call, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Thunder Punch", 12);
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Electro Ball", 8);
    }

    void thunder(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Thunder", 14);

        // Give thunder pokemon a HP boost!
        name.setHp(name.getHp() + 10);
        System.out.println(name.getName() + " gained 10 hit points due to the effects of Thunder!");

        if (Objects.equals(enemy.getType(), "electric")) {
            enemy.setHp(enemy.getHp() + 10);
            System.out.println(enemy.getName() + " gained 10 hit points due to the effects of Thunder!");
        }
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Volt Tackle", 10);
    }
}
