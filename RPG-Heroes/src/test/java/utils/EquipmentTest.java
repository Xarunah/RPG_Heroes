package utils;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquipmentTest {
    private Equipment equipmentTest;

    @Before
    public void init () {
        Item staff = new Item("GreatStaff", SlotTypes.WEAPONSLOT, WeaponType.STAFF, 20);
        Item head = new Item("BigHead",SlotTypes.HEADSLOT, ArmorTypes.PLATE, 5);
        Item body = new Item("RedDress",SlotTypes.BODYSLOT, ArmorTypes.CLOTH, 6);
        Item legs = new Item("LeggyLegs", SlotTypes.LEGSLOT, ArmorTypes.LEATHER, 9);

        equipmentTest = new Equipment(staff, head, body, legs);
    }

    @Test
    public void CheckWeaponType () {
        assertSame(SlotTypes.WEAPONSLOT, equipmentTest.getWeapon().getSlot());
    }

    @Test
    public void CheckHeadType () {assertSame(SlotTypes.HEADSLOT, equipmentTest.getHead().getSlot());}
    @Test
    public void CheckBodyType () {
        assertSame(SlotTypes.BODYSLOT, equipmentTest.getBody().getSlot());
    }

    @Test
    public void CheckLegType () {
        assertSame(SlotTypes.LEGSLOT, equipmentTest.getLegs().getSlot());
    }

}
