public class Hero extends Character {
    private int level;
    private Clazz clazz;
    private Characteristic characteristic;
    private Position position;
    private Equipment equipment;

    public Hero(Clazz clazz) {
        super();
        this.level = 1;
        this.clazz = clazz;
        this.characteristic = new Characteristic(this.clazz, this.level);
        this.position = new Position(0, 0);
    }
}
