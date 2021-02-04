package enums;

public enum Consumables {

    POTION(10),
    HERB(5);

    private int healValue;

    Consumables(int healValue){
        this.healValue = healValue;
    }

    public int getHealValue(){
        return this.healValue;
    }
}
