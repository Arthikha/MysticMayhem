package ArmyPackage;

public class Saggitarius extends Archers {

	private String Name = "Saggitarius";
	private int Price = 230;
	private int Attack = 18;
	private int Defence = 7;
	private int Health = 12;
	private int Speed = 17;
	
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
		return "Saggitarius [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	public void storeOriginalValue() {
		String Name = "Saggitarius";
		int Price = 230;
		int Attack = 18;
		int Defence = 7;
		int Health = 12;
		int Speed = 17;
		
	}
	
}
