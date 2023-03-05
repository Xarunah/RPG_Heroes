package utils;

public class Equipment {

    private Item weapon;
    private Item head;
    private Item body;
    private Item legs;

    public Equipment(Item weapon, Item head, Item body, Item legs) {
        this.weapon = weapon;
        this.head = head;
        this.body = body;
        this.legs = legs;
    }

    //Getters and setters
    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public Item getBody() {
        return body;
    }

    public void setBody(Item body) {
        this.body = body;
    }

    public Item getLegs() {
        return legs;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }
}
