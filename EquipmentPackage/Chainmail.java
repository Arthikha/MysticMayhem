package EquipmentPackage;

public class Chainmail extends Armour {
	
	private final int Price = 70;
    private final int Attack = 0;
    private final int Defence = +1;
    private final int Health = 0;
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
		return "Chainmail [Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health=" + Health
				+ ", Speed=" + Speed + "]";
	}


}
