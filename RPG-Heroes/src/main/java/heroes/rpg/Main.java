package heroes.rpg;

import heroes.rpg.hero.Mage;
import utils.*;

public class Main {
    public static void main(String[] args) {
        Item staff = new Item("GreatStaff", SlotTypes.WEAPONSLOT, WeaponType.STAFF, 20);
        Item head = new Item("BigHead", SlotTypes.HEADSLOT, ArmorTypes.CLOTH, 5);
        Item body = new Item("RedDress",SlotTypes.BODYSLOT, ArmorTypes.LEATHER, 6);
        Item legs = new Item("LeggyLegs", SlotTypes.LEGSLOT, ArmorTypes.MAIL, 9);

        Equipment heroEquipment = new Equipment(staff, head, body, legs);

        Stats mageStats = new Stats(1,1,8);
        Mage heroMage = new Mage(mageStats,"Jens", heroEquipment,1);

    }


}