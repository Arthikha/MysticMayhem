package ArmyPackage;

public class Squire extends Knights {

	private String Name = "Squire";
	private int Price = 85;
	private int Attack = 8;
	private int Defence = 9;
	private int Health = 7;
	private int Speed = 8;
	
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
		return "Squire [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Squire";
		int Price = 85;
		int Attack = 8;
		int Defence = 9;
		int Health = 7;
		int Speed = 8;
		
	}
	
	

}
