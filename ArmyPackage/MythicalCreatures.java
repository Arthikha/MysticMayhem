package ArmyPackage;

public abstract class MythicalCreatures implements Army {
	abstract public String getName();
	abstract public int getPrice();
	abstract public int getAttack();
	abstract public int getDefence();
	abstract public int getHealth();
	abstract public int getSpeed();
	abstract public void setAttack(int i);
	abstract public void setDefence(int i);
	abstract public void setHealth(int i);
	abstract public void setSpeed(int i);
}
