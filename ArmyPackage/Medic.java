package ArmyPackage;

public class Medic extends Healers {

	private String Name = "Medic";
	private int Price = 125;
	private int Attack = 12;
	private int Defence = 9;
	private int Health = 10;
	private int Speed = 7;
	
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
		return "Medic [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}


	public void storeOriginalValue() {
		String Name = "Medic";
		int Price = 125;
		int Attack = 13;
		int Defence = 8;
		int Health = 11;
		int Speed = 8;
		
	}
	
	
}
