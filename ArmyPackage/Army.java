package ArmyPackage;

public interface Army {
	abstract public String getName();
	abstract public int getPrice();
	abstract public int getAttack();
	abstract public int getDefence();
	abstract public int getHealth();
	abstract public int getSpeed();
	abstract public void setAttack(int a);
	abstract public void setDefence(int i);
	abstract public void setHealth(int d);
	abstract public void setSpeed(int i);
	abstract public void storeOriginalValue();
}
