package ArmyPackage;

public class Conjurer extends Mages {

	private String Name = "Conjurer";
	private int Price = 195;
	private int Attack = 18;
	private int Defence = 15;
	private int Health = 14;
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
		return "Conjurer [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Conjurer";
		int Price = 195;
		int Attack = 18;
		int Defence = 15;
		int Health = 14;
		int Speed = 12;
		
	}
	
}
