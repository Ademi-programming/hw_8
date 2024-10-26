package kg.geeks.game.players;

public class Reaper extends Hero {

    public Reaper(String name, int health, int damage, int maxHealth) {
        super(name, health, damage, maxHealth);
    }

    @Override
    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
        int actualDamage = getDamage();

        if (getHealth() < getMaxHealth() * 0.15) {
            actualDamage *= 3;
        } else if (getHealth() < getMaxHealth() * 0.3) {
            actualDamage *= 2;
        }

        boss.takeDamage(actualDamage);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
