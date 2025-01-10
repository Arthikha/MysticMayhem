package ArmyPackage;

public class Zoro extends Knights {

	private String Name = "Zoro";
	private int Price = 180;
	private int Attack = 17;
	private int Defence = 16;
	private int Health = 13;
	private int Speed = 14;
	
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
		return "Zoro [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}
	
	public void storeOriginalValue() {
		String Name = "Zoro";
		int Price = 180;
		int Attack = 17;
		int Defence = 16;
		int Health = 13;
		int Speed = 14;
		
	}
}
