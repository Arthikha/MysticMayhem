package ArmyPackage;

public class Ranger extends Archers {

	private String Name = "Ranger";
	private int Price = 115;
	private int Attack = 14;
	private int Defence = 5;
	private int Health = 8;
	private int Speed = 10;
	
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
		return "Ranger [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Ranger";
		int Price = 115;
		int Attack = 14;
		int Defence = 6;
		int Health = 8;
		int Speed = 9;
		
	}
}
