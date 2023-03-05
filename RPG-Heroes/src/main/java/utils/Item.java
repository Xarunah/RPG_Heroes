package utils;

public class Item {
    private String name;
    private SlotTypes slot;
    private ArmorTypes armorType;
    private WeaponType weaponType;
    private int requiredLvl;

    public Item(String name, SlotTypes slot, WeaponType weaponType, int requiredLvl) {
        this.name = name;
        this.slot = slot;
        this.weaponType = weaponType;
        this.requiredLvl = requiredLvl;
    }

    public Item(String name, SlotTypes slot, ArmorTypes armorType, int requiredLvl) {
        this.name = name;
        this.slot = slot;
        this.armorType = armorType;
        this.requiredLvl = requiredLvl;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SlotTypes getSlot() {
        return slot;
    }

    public void setSlot(SlotTypes slot) {
        this.slot = slot;
    }

    public ArmorTypes getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorTypes armorType) {
        this.armorType = armorType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getRequiredLvl() {
        return requiredLvl;
    }

    public void setRequiredLvl(int requiredLvl) {
        this.requiredLvl = requiredLvl;
    }
}
