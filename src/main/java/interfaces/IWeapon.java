package interfaces;

import characters.npcs.Npc;
import characters.players.Player;

public interface IWeapon {

    void attackNpc(Npc npc);
    void attackPlayer(Player player);

}
