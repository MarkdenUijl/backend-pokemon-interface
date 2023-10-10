public abstract class Attack {
    public void makeAttack(Pokemon attackingPokemon, Pokemon defendingPokemon, String attackName, int initialDamage) {
        double finalDamage = initialDamage * getAttackModifier(attackingPokemon, defendingPokemon);
        int remainingHp = (int) (defendingPokemon.getHp() - finalDamage);
        defendingPokemon.setHp( remainingHp );

        System.out.println(attackingPokemon.getName() + " attacks " + defendingPokemon.getName() + " with " + attackName);
        System.out.println(defendingPokemon.getName() + " loses " + finalDamage + " hitpoints!");

        if ( remainingHp > 0 ) {
            System.out.println(defendingPokemon.getName() + " has " + remainingHp + " health left!");
        } else {
            System.out.println(defendingPokemon.getName() + " has fainted!");
        }
    }

    public static double getAttackModifier(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        switch (attackingPokemon.getType()) {
            case "fire" -> {
                switch (defendingPokemon.getType()) {
                    case "grass" -> { return 2; }
                    case "water" -> { return 1.5; }
                    case "electric" -> { return 1; }
                    default -> { return 0.5; }
                }
            }
            case "grass" -> {
                switch (defendingPokemon.getType()) {
                    case "electric" -> { return 2; }
                    case "fire" -> { return 1.5; }
                    case "water" -> { return 1; }
                    default -> { return 0.5; }
                }
            }
            case "electric" -> {
                switch (defendingPokemon.getType()) {
                    case "water" -> { return 2; }
                    case "grass" -> { return 1.5; }
                    case "fire" -> { return 1; }
                    default -> { return 0.5; }
                }
            }
            default -> {
                switch (defendingPokemon.getType()) {
                    case "fire" -> { return 2; }
                    case "electric" -> { return 1.5; }
                    case "grass" -> { return 1; }
                    default -> { return 0.5; }
                }
            }
        }
    }
}
