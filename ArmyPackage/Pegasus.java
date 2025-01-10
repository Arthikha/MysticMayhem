package ArmyPackage;

public class Pegasus extends MythicalCreatures {

	private String Name = "Pegasus";
	private int Price = 340;
	private int Attack = 14;
	private int Defence = 18;
	private int Health = 20;
	private int Speed = 20;
	
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
		return "Pegasus [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Pegasus";
		int Price = 340;
		int Attack = 14;
		int Defence = 18;
		int Health = 20;
		int Speed = 20;
		
	}
}
