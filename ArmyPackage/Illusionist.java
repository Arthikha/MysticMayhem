package ArmyPackage;

public class Illusionist extends Mages {
	private String Name = "Illusionist";
	private int Price = 120;
	private int Attack = 13;
	private int Defence = 8;
	private int Health = 12;
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


	@Override
	public String toString() {
		return "Illusionist [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Illusionist";
		int Price = 120;
		int Attack = 13;
		int Defence = 8;
		int Health = 12;
		int Speed = 14;
		
	}
}
