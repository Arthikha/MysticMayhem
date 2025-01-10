package ArmyPackage;

public class Hydra extends MythicalCreatures {

	private String Name = "Hydra";
	private int Price = 205;
	private int Attack = 12;
	private int Defence = 16;
	private int Health = 15;
	private int Speed = 11;
	
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
		return "Hydra [Name=" + Name + ", Price=" + Price + ", Attack=" + Attack + ", Defence=" + Defence + ", Health="
				+ Health + ", Speed=" + Speed + "]";
	}


	@Override
	public void storeOriginalValue() {
		String Name = "Hydra";
		int Price = 205;
		int Attack = 12;
		int Defence = 16;
		int Health = 15;
		int Speed = 11;
		
	}
	
	
}
