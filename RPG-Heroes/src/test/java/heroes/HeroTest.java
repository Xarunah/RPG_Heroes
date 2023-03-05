package heroes;

import heroes.rpg.hero.Mage;
import heroes.rpg.hero.Ranger;
import heroes.rpg.hero.Rogue;
import heroes.rpg.hero.Warrior;
import org.junit.Before;
import org.junit.Test;
import utils.*;

import static org.junit.Assert.*;

public class HeroTest {

    private Mage testMage;
    private Ranger testRanger;
    private Rogue testRogue;
    private Warrior testWarrior;

    @Before
    public void init () {
        Item staff = new Item("GreatStaff", SlotTypes.WEAPONSLOT, WeaponType.STAFF, 20);
        Item head = new Item("BigHead",SlotTypes.HEADSLOT, ArmorTypes.PLATE, 5);
        Item body = new Item("RedDress",SlotTypes.BODYSLOT, ArmorTypes.CLOTH, 6);
        Item legs = new Item("LeggyLegs", SlotTypes.LEGSLOT, ArmorTypes.LEATHER, 9);
        Item bow = new Item("GreatBowOfDeath", SlotTypes.WEAPONSLOT, WeaponType.BOW, 1);
        Item dagger = new Item("DaggyDagger", SlotTypes.WEAPONSLOT, WeaponType.DAGGER, 2);
        Item axe = new Item("AxyAxe", SlotTypes.WEAPONSLOT, WeaponType.AXE, 1);

        Equipment mageEquipment = new Equipment(staff, head, body, legs);
        Equipment rangerEquipment = new Equipment(bow, head, body, legs);
        Equipment rogueEquipment = new Equipment(dagger, head, body, legs);
        Equipment warriorEquipment = new Equipment(axe, head, body, legs);

        Stats mageStats = new Stats(1,1,8);
        testMage = new Mage(mageStats, "Hanne", mageEquipment, 25);

        Stats rangerStats = new Stats(1,7,1);
        testRanger = new Ranger(rangerStats,"Hans", rangerEquipment,15);

        Stats rogueStats = new Stats(2,6,1);
        testRogue = new Rogue(rogueStats,"Ole", rogueEquipment,10);

        Stats warriorStats = new Stats(5,2,1);
        testWarrior = new Warrior (warriorStats,"Lone", warriorEquipment,12);
    }
    @Test
    public void MageStatTest (){
        assertEquals(testMage.getStats().getIntelligence(),8);
    }
    @Test
    public void RangerStatTest (){
        assertEquals(testRanger.getStats().getDexterity(),7);
    }

    @Test
    public void RogueStatTest (){
        assertEquals(testRogue.getStats().getDexterity(), 6);
    }

    @Test
    public void WarriorStatTest (){
        assertEquals(testWarrior.getStats().getStrength(),5);
    }



}
