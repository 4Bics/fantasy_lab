package characters.players;

import characters.npcs.Npc;
import enums.Consumables;
import enums.Weapons;
import interfaces.IHeal;
import interfaces.IWeapon;

import java.util.ArrayList;

public abstract class Player implements IWeapon, IHeal {

    private String name;
    private int healthPool;
    protected Weapons weapon;
    private ArrayList<Consumables> backpack;

    public Player(String name, int healthPool, Weapons weapon){
        this.name = name;
        this.healthPool = healthPool;
        this.weapon = weapon;
        backpack = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPool(){
        return this.healthPool;
    }

    public void setHealthPool(int healthPool) {
        this.healthPool = healthPool;
    }

    public void takeDamage(int damageTaken){
        this.healthPool -= damageTaken;
    }

    public void attackNpc(Npc npc){
        npc.setHealthPool(npc.getHealthPool() - this.weapon.getDamageValue());
    }

    public void attackPlayer(Player player){
        player.setHealthPool(player.getHealthPool() - this.weapon.getDamageValue());
    }

    public void heal(Consumables consumable){
        if (backpack.contains(consumable)){
            healthPool += consumable.getHealValue();
            backpack.remove(consumable);
        }
    }

    public void addConsumableBackPack(Consumables consumable){
        backpack.add(consumable);
    }

}
