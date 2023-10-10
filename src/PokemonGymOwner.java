import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemon){
        super(name, pokemon);
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }
}