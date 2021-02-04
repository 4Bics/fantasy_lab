package characters.players.fighters;

import characters.players.Player;

public abstract class Fighter extends Player {

    private int energyResource;

    public Fighter(String name, int healthPool, int energyResource){
        super(name, healthPool);
        this.energyResource = energyResource;
    }

    public int getEnergyResource(){
        return this.energyResource;
    }
}
