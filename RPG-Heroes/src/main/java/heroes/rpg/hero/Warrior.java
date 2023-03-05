package heroes.rpg.hero;

import utils.ArmorTypes;
import utils.Equipment;
import utils.Stats;
import utils.WeaponType;

//Hero subclass
public class Warrior extends Hero{

    private ArmorTypes validArmorTypes = ArmorTypes.PLATE;
    private WeaponType validWeaponTypes = WeaponType.AXE;

    public Warrior(Stats stats, String name, Equipment equipment, int lvl) {
        super(stats, name, equipment, lvl);
    }

    //Added stats upon leveling up
    @Override
    public void LvlUP() {
        this.stats.setDexterity(stats.getDexterity() + 2);
        this.stats.setStrength(stats.getStrength() + 3);
        this.stats.setIntelligence(stats.getIntelligence() + 1);
    }

    @Override
    public void Damage() {
        double damage = 0;
        damage = this.stats.getStrength()*7.4;
        System.out.println("This heroes damage is: " + damage);
    }
}
