package ArmyPackage;

public class Dragon extends MythicalCreatures {

	private String Name = "Dragon";
	private int Price = 120;
	private int Attack = 12;
	private int Defence = 14;
	private int Health = 15;
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
		return "Dragon [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Dragon";
		int Price = 120;
		int Attack = 12;
		int Defence = 14;
		int Health = 15;
		int Speed = 8;
	}

}
