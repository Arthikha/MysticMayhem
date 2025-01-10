package ArmyPackage;

public class Lightbringer extends Healers {

	private String Name = "Lightbringer";
	private int Price = 260;
	private int Attack = 17;
	private int Defence = 15;
	private int Health = 19;
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
		return "Lightbringer [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Lightbringer";
		int Price = 260;
		int Attack = 17;
		int Defence = 15;
		int Health = 19;
		int Speed = 12;
	}
}
