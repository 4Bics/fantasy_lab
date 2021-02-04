package enums;

public enum Weapons {

    SWORD(3),
    AXE(4),
    CLUB(2);

    private final int damageValue;

    Weapons(int damageValue){
        this.damageValue = damageValue;
    }

    public int getDamageValue(){
        return damageValue;
    }

    public int enhanceDamage(int i){
        return damageValue + i;
    }

}