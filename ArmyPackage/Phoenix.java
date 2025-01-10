package ArmyPackage;

public class Phoenix extends MythicalCreatures {

	private String Name = "Phoenix";
	private int Price = 275;
	private int Attack = 17;
	private int Defence = 13;
	private int Health = 17;
	private int Speed = 19;
	
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
		return "[Phoenix [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Phoenix";
		int Price = 275;
		int Attack = 17;
		int Defence = 13;
		int Health = 17;
		int Speed = 19;
		
	}
}
