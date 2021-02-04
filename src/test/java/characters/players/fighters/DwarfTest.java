package characters.players.fighters;

import enums.Weapons;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf dwarf;
    Dwarf dwarf1;

    @org.junit.Before
    public void setUp() throws Exception {
        dwarf = new Dwarf("Durin", 100, 100, Weapons.SWORD);
        dwarf1 = new Dwarf("Peter", 100, 100, Weapons.AXE);
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
        int attackValue = dwarf.attack();
        int secondAttackValue = dwarf1.attack();
        assertEquals(4, attackValue);
    }
}