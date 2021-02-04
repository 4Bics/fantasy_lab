package enums;

public enum Spells {

    FIREBOLT(5, 40),
    ICEBOLT(4, 30),
    ARCANEBOLT(2, 15),
    HEAL(40, 50);

    private final int damageValue;
    private final int manaCost;

    Spells(int damageValue, int manaCost){
        this.damageValue = damageValue;
        this.manaCost = manaCost;
    }

    public int getDamageValue(){
        return damageValue;
    }

    public int getManaCost(){
        return manaCost;
    }

}

