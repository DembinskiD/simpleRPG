public enum Clazz {
    WARRIOR,PALADIN,MAGE,DRUID,NONE;

    public int getHP() {
        switch (this.ordinal()) {
            case 0: return 15;
            case 1: return 10;
            default: return 5;
        }
    }

    public int getPhysAttack() {
        switch (this.ordinal()) {
            case 0: return 15;
            case 1: return 10;
            default: return 5;
        }
    }

    public int getMagicAttack() {
        switch (this.ordinal()) {
            case 2: return 15;
            case 3: return 15;
            default: return 0;
            case 0: return 5;
            case 1: return 10;
        }
    }

    public int getMana() {
        switch (this.ordinal()) {
            case 1: return 10;
            case 2: return 30;
            case 3: return 30;
            default: return 5;
        }
    }
}
