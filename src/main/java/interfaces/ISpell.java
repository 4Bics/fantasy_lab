package interfaces;

import characters.npcs.Npc;
import enums.Spells;

public interface ISpell {

    void castSpell(Spells spell, Npc npc);

}
