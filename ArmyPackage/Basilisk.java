package ArmyPackage;

public class Basilisk extends MythicalCreatures {

	private String Name = "Basilisk";
	private int Price = 165;
	private int Attack = 15;
	private int Defence = 11;
	private int Health = 10;
	private int Speed = 12;
	
	public String getName() {
		return this.Name;
	}

	
	public int getPrice() {
		return this.Price;
	}

	
	public int getAttack() {
		return this.Attack;
	}

	
	public int getDefence() {
		return this.Defence;
	}

	
	public int getHealth() {
		return this.Health;
	}

	
	public int getSpeed() {
		return this.Speed;
	}
	
	public void setAttack(int attack) {
		Attack += attack;
	}


	public void setDefence(int defence) {
		Defence += defence;
	}


	public void setHealth(int health) {
		Health += health;
	}


	public void setSpeed(int speed) {
		Speed += speed;
	}

	public String toString() {
		return "Basilisk [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Basilisk";
		int Price = 165;
		int Attack = 15;
		int Defence = 11;
		int Health = 10;
		int Speed = 12;
		
	}

}
