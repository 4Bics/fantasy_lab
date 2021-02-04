package characters.players.casters;

import characters.npcs.Npc;
import characters.players.Player;
import enums.Spells;
import enums.Weapons;
import interfaces.ISpell;

public abstract class Caster extends Player implements ISpell {

    private int manaPool;

    public Caster(String name, int healthPool, int manaPool, Weapons weapon){
        super(name, healthPool, weapon);
        this.manaPool = manaPool;
    }

    public int getManaPool(){
        return this.manaPool;
    }

    public void castSpell(Spells spell, Npc npc){
        if (spell.getManaCost() < this.manaPool & spell != Spells.HEAL){
            this.manaPool -= spell.getManaCost();
        }
        npc.setHealthPool(npc.getHealthPool() - spell.getDamageValue());
    }

}
