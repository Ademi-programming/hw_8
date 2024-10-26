package kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private int maxHealth;
    private SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public Hero(String name, int health, int damage, int maxHealth) {
        super(name, health, damage);
        this.maxHealth = maxHealth;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public int getMaxHealth() {
        return maxHealth;
    }

}
