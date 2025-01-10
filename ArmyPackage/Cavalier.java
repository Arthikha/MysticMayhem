package ArmyPackage;

public class Cavalier extends Knights {

	private String Name = "Cavalier";
	private int Price = 110;
	private int Attack = 10;
	private int Defence = 12;
	private int Health = 7;
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
		return "Cavalier [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Cavalier";
		int Price = 110;
		int Attack = 10;
		int Defence = 12;
		int Health = 7;
		int Speed = 10;
	}

}
