package ArmyPackage;

public class Templar extends Knights {

	private String Name = "Templar";
	private int Price = 155;
	private int Attack = 14;
	private int Defence = 16;
	private int Health = 12;
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
		return "Templer [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence
				+ ", Health=" + Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Templar";
		int Price = 155;
		int Attack = 14;
		int Defence = 16;
		int Health = 12;
		int Speed = 12;
		
	}
}
