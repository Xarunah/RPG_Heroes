package heroes.rpg.hero;

import utils.ArmorTypes;
import utils.Equipment;
import utils.Stats;
import utils.WeaponType;

//Hero subclass
public class Ranger extends Hero {

    private ArmorTypes validArmorTypes = ArmorTypes.LEATHER;
    private WeaponType validWeaponTypes = WeaponType.BOW;

    public Ranger(Stats stats, String name, Equipment equipment, int lvl) {
        super(stats, name, equipment, lvl);
    }

    //Added stats upon leveling up
    @Override
    public void LvlUP() {
        this.stats.setDexterity(stats.getDexterity() + 5);
        this.stats.setStrength(stats.getStrength() + 1);
        this.stats.setIntelligence(stats.getIntelligence() + 1);
    }

    @Override
    public void Damage() {
        double damage = 0;
        damage = this.stats.getDexterity()*5.4;
        System.out.println("This heroes damage is: " + damage);
    }
}
