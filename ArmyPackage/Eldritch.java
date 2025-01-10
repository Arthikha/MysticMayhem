package ArmyPackage;

public class Eldritch extends Mages {

	private String Name = "Eldritch";
	private int Price = 270;
	private int Attack = 19;
	private int Defence = 17;
	private int Health = 18;
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
		return "Eldritch [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Eldritch";
		int Price = 270;
		int Attack = 19;
		int Defence = 17;
		int Health = 18;
		int Speed = 14;
		
	}
}
