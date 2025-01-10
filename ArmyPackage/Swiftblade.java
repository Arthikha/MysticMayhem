package ArmyPackage;

public class Swiftblade extends Knights {

	private String Name = "Swiftblade";
	private int Price = 250;
	private int Attack = 18;
	private int Defence = 20;
	private int Health = 17;
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
		return "Swiftblade [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}

	public void storeOriginalValue() {
		String Name = "Swiftblade";
		int Price = 250;
		int Attack = 18;
		int Defence = 20;
		int Health = 17;
		int Speed = 13;
	}
}
