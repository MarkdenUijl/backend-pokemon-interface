import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemon;

    public PokemonTrainer(String name, List<Pokemon> pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public String getName() {
        return this.name;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemon;
    }
}
