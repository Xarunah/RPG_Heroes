package heroes.rpg.hero;

import utils.*;
import java.util.Objects;

//Abstract class for heroes
public abstract class Hero {
    protected Stats stats;
    private final String name;
    private Equipment equipment;
    private int lvl;

    public Hero(Stats stats, String name, Equipment equipment, int lvl) {
        this.stats = stats;
        this.name = name;
        this.equipment = equipment;
        this.lvl = lvl;
    }

    //Getters and setters
    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void LvlUP() {

    }

    //Display the hero stats
    public void DisplayHero(){
        System.out.println("Strength: " + this.stats.getStrength() + "Dexterity: " + this.stats.getDexterity() + "Intelligence: " + this.stats.getIntelligence());
    }

    public void Damage(){

    }

    public void Equip(Item newItem){
        if (Objects.equals(newItem.getSlot(), SlotTypes.HEADSLOT)) {
            this.equipment.setHead(newItem);
        }
        if (Objects.equals(newItem.getSlot(), SlotTypes.BODYSLOT)) {
            this.equipment.setBody(newItem);
        }
        if (Objects.equals(newItem.getSlot(), SlotTypes.LEGSLOT)) {
            this.equipment.setLegs(newItem);
        }
        if (Objects.equals(newItem.getSlot(), SlotTypes.WEAPONSLOT)) {
            this.equipment.setWeapon(newItem);
        }
    }
}

