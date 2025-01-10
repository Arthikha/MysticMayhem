package ArmyPackage;

public class Alchemist extends Healers {

	private String Name = "Alchemist";
	private int Price = 150;
	private int Attack = 13;
	private int Defence = 13;
	private int Health = 13;
	private int Speed = 13;
	
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

	public String toString() {
		return "Alchemist [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
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

	public void storeOriginalValue() {
		String Name = "Alchemist";
		int Price = 150;
		int Attack = 13;
		int Defence = 13;
		int Health = 13;
		int Speed = 13;
		
	}
	
}
