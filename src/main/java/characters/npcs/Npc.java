package characters.npcs;

import characters.players.Player;
import enums.Weapons;
import interfaces.IWeapon;

public abstract class Npc implements IWeapon {

    private String name;
    private int healthPool;
    private int energyResource;
    private boolean isFriendly;
    private Weapons weapon;

    public Npc(String name, int healthPool, int energyResource, boolean isFriendly, Weapons weapon){
        this.name = name;
        this.healthPool = healthPool;
        this.energyResource = energyResource;
        this.isFriendly = isFriendly;
        this.weapon = weapon;
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

    public void attackPlayer(Player player) {
        player.setHealthPool(player.getHealthPool() - this.weapon.getDamageValue());
    }

    public void attackNpc(Npc npc){
        npc.setHealthPool(npc.getHealthPool() - this.weapon.getDamageValue());
    }

}
