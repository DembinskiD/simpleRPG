public class Characteristic {
    private int healthPoints;
    private int manaPoints;
    private int physicalAttack;
    private int magicAttack;

    public Characteristic(Clazz clazz, int level) {
        this.healthPoints = level * clazz.getHP();
        this.manaPoints = level * clazz.getMana();
        this.physicalAttack = level * clazz.getPhysAttack();
        this.magicAttack = level * clazz.getMagicAttack();
    }
}
