package EquipmentPackage;

//import EquipmentPackage.Armour;

public class Fleece extends Armour {

    private final int Price = 150;
    private final int Attack = 0;
    private final int Defence = +2;
    private final int Health = +1;
    private final int Speed = -1;

    public int getPrice() {
        return Price;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefence() {
        return Defence;
    }

    public int getHealth() {
        return Health;
    }

    public int getSpeed() {
        return Speed;
    }

    public String toString() {
        return "Fleece [Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health=" + Health
                + ", Speed=" + Speed + "]";
    }
}
