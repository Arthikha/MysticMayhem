package EquipmentPackage;

public class Amulet extends Artefacts {

    private int Price = 200;
    private int Attack = 1;
    private int Defence = -1;
    private int Health = 1;
    private int Speed = 1;

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
        return "Amulet [Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health=" + Health
                + ", Speed=" + Speed + "]";
    }

}
