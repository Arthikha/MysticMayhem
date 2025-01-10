package ArmyPackage;

public class Shooter extends Archers{
	private String Name = "Shooter";
	private int Price = 80;
	private int Attack = 11;
	private int Defence = 4;
	private int Health = 6;
	private int Speed = 9;
	
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


	@Override
	public String toString() {
		return "Shooter [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Shooter";
		int Price = 80;
		int Attack = 11;
		int Defence = 4;
		int Health = 6;
		int Speed = 9;
		
	}
}
