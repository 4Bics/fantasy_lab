package characters.players.fighters;

import characters.npcs.Npc;
import characters.players.Player;
import enums.Weapons;

public abstract class Fighter extends Player {

    private int energyResource;

    public Fighter(String name, int healthPool, Weapons weapon, int energyResource){
        super(name, healthPool, weapon);
        this.energyResource = energyResource;
    }

    public int getEnergyResource(){
        return this.energyResource;
    }

    public void attackNpc(Npc npc){
        npc.setHealthPool(npc.getHealthPool() - this.weapon.enhanceDamage(1));
    }

}
