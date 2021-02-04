package characters.npcs;

import interfaces.IWeapon;

public abstract class Npc implements IWeapon {

    private String name;
    private int healthPool;
    private int energyResource;
    private boolean isFriendly;

    public Npc(String name, int healthPool, int energyResource, boolean isFriendly){
        this.name = name;
        this.healthPool = healthPool;
        this.energyResource = energyResource;
        this.isFriendly = isFriendly;
    }

    public String getName() {
        return name;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public void setHealthPool(int i){
        this.healthPool = i;
    }

    public int getEnergyResource() {
        return energyResource;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void becomeFriendly() {
        this.isFriendly = true;
    }

    public void becomeHostile() {
        this.isFriendly = false;
    }

    public void takeDamage(int damageTaken){
        this.healthPool -= damageTaken;
    }
}
