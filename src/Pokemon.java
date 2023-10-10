abstract class Pokemon extends Attack {
    private final String name;
    private final int level;
    private final String type;
    private final String food;
    private final String sound;
    private int hp;

    private boolean wasFed = false;

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int newHp) {
        this.hp = newHp;
    }

    public String getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public String getFood() {
        return this.food;
    }

    public String getSound() {
        return this.sound;
    }

    public void feedPokemon(String food) {
        if (!wasFed) {
            if (food.equalsIgnoreCase(this.food)) {
                System.out.println("You fed " + this.name + " some " + food + ", it gains 25 hitpoints!");
                this.hp += 25;
                this.wasFed = true;
            } else {
                System.out.println(this.name + " refuses to eat the " + food + "!");
            }
        } else {
            System.out.println("You have already fed " + this.name + ", it refuses to eat more.");
        }
    }
}
