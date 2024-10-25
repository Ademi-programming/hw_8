package kg.geeks.game.players;

public class Magic extends Hero {
    private int roundCounter = 0;
    private final int maxRound = 4;
    private final int increaseDamage;
    public Magic(String name, int health, int damage, int increaseDamage) {
        super(name, health, damage, SuperAbility.BOOST);
        this.increaseDamage = increaseDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if ( roundCounter < maxRound ) {
            for ( Hero hero : heroes) {
                hero.setDamage(hero.getDamage() + increaseDamage);
            }
            System.out.println("Magic " + getName() + "increased the damage of hero for round " + (roundCounter + 1));
            roundCounter++;
        } else {
            System.out.println("Magic " + getName() + "cannot increase damage");
        }
    }
}
