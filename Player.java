public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() { return health; }
    public String getName() { return name; }

    public void reduceHealth(int damage) {
        health = Math.max(0, health - damage);
    }

    public int calculateAttackDamage(int diceRoll) {
        return attack * diceRoll;
    }

    public int calculateDefense(int diceRoll) {
        return strength * diceRoll;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
