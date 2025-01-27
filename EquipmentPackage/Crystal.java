package EquipmentPackage;

public class Crystal extends Artefacts {

	private int Price = 210;
    private int Attack = 2;
    private int Defence = 1;
    private int Health = -1;
    private int Speed = -1;
   
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
		return "Crystal [Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health=" + Health
				+ ", Speed=" + Speed + "]";
	}
	
}

