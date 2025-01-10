package ArmyPackage;

public class Soother extends Healers {

	private String Name = "Soother";
	private int Price = 95;
	private int Attack = 10;
	private int Defence = 8;
	private int Health = 9;
	private int Speed = 6;
	
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
		return "Soother [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Soother";
		int Price = 95;
		int Attack = 10;
		int Defence = 8;
		int Health = 9;
		int Speed = 6;
		
	}
}
