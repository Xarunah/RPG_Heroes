package heroes.rpg.hero;

import utils.ArmorTypes;
import utils.Equipment;
import utils.Stats;
import utils.WeaponType;

//Hero subclass
public class Rogue extends Hero {

    private ArmorTypes validArmorTypes = ArmorTypes.MAIL;
    private WeaponType validWeaponTypes = WeaponType.DAGGER;

    public Rogue(Stats stats, String name, Equipment equipment, int lvl) {
        super(stats, name, equipment, lvl);
    }

    //Added stats upon leveling up
    @Override
    public void LvlUP() {
        this.stats.setDexterity(stats.getDexterity() + 4);
        this.stats.setStrength(stats.getStrength() + 1);
        this.stats.setIntelligence(stats.getIntelligence() + 1);
    }

    @Override
    public void Damage() {
        double damage = 0;
        damage = this.stats.getDexterity()*2.4;
        System.out.println("This heroes damage is: " + damage);
    }
}
