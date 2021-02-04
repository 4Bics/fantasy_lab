package characters.players.fighters;

import characters.npcs.Ogre;
import enums.Weapons;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf dwarf;
    Ogre ogre;

    @org.junit.Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Durin", 100, 100, Weapons.SWORD);
        ogre = new Ogre("Shrek", 100, 100, false, Weapons.CLUB);
    }

    @org.junit.Test
    public void getEnergyResource() {
        assertEquals(100, dwarf.getEnergyResource());
    }

    @org.junit.Test
    public void getName() {
        assertEquals("Durin", dwarf.getName());
    }

    @org.junit.Test
    public void getHealthPool() {
        assertEquals(100, dwarf.getHealthPool());
    }

    @org.junit.Test
    public void takeDamage() {
        dwarf.takeDamage(50);
        assertEquals(50, dwarf.getHealthPool());
    }

    @org.junit.Test
    public void attack() {
        dwarf.attackNpc(ogre);
        assertEquals(96, ogre.getHealthPool());
    }
}