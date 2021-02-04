package characters.players.casters;

import characters.npcs.Npc;
import characters.players.Player;
import enums.Spells;
import enums.Weapons;

public class Cleric extends Caster {
    public Cleric(String name, int healthPool, int manaPool, Weapons weapon) {
        super(name, healthPool, manaPool, weapon);
    }

    public void castHeal(Spells spell, Player player){
        if (spell == Spells.HEAL){
            if (spell.getManaCost() < this.getManaPool()){
                player.setHealthPool(player.getHealthPool() + spell.getDamageValue());
            }

        }
    }
}
