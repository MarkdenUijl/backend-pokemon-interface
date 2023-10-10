import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String call) {
        super(name, level, hp, food, call, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Leaf Storm", 12);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Solar Beam", 14);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        int healAmount = (int) (8 * getAttackModifier(name, enemy));

        makeAttack(name, enemy, "Leech Seed", 8);

        name.setHp(name.getHp() + healAmount);
        System.out.println(name.getName() + " healed " + healAmount + " from Leech Seed!");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        makeAttack(name, enemy, "Leaf Blade", 10);
    }
}
