package ArmyPackage;

public class Sunfire extends Archers {

	private String Name = "Sunfire";
	private int Price = 160;
	private int Attack = 15;
	private int Defence = 5;
	private int Health = 7;
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
		return "Sunfire [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Sunfire";
		int Price = 160;
		int Attack = 15;
		int Defence = 5;
		int Health = 7;
		int Speed = 14;
	}
	
	

}
