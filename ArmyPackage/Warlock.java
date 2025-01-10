package ArmyPackage;

public class Warlock extends Mages {

	private String Name = "Warlock";
	private int Price = 100;
	private int Attack = 12;
	private int Defence = 7;
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
		return "Warlock [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	public void storeOriginalValue() {
		String Name = "Warlock";
		int Price = 100;
		int Attack = 12;
		int Defence = 7;
		int Health = 10;
		int Speed = 12;
		
	}
}
