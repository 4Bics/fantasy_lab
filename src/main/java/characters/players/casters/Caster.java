package characters.players.casters;

import characters.players.Player;

public abstract class Caster extends Player {

    private int manaPool;

    public Caster(String name, int healthPool, int manaPool){
        super(name, healthPool);
        this.manaPool = manaPool;
    }

    public int getManaPool(){
        return this.manaPool;
    }

}
