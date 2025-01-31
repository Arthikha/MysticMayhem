package PlayerProfile;

import ArmyPackage.*;
import HomeGroundPackage.HomeGround;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BattleSystem {
    private final ArrayList<Army> player1Team;
    private final List<Army> player2Team;

    public BattleSystem(ArrayList<Army> player1Team, List<Army> player2Team) {
        this.player1Team = player1Team;
        this.player2Team = player2Team;
    }

    // Method to start the battle
    public void startBattle() {
        for (int turn = 1; turn <= 11; turn++) {
            System.out.println("Turn " + turn);
            List<Army> sortedArmies = getSortedArmies();

            HomeGround ground = new HomeGround();
            for (Army attacker : sortedArmies) {
        
                if (ground.highLanders.contains(attacker)){
                    Opponent opp = new Opponent();
                    String warplace = opp.selectRandomOpponent().getHomeGround();
                    if (turn==11 && warplace =="Hillcrest"){
                        int a = (int)(attacker.getAttack() * 0.2);
                        attacker.setAttack(a);
        
                    }
                }
                if (attacker.getHealth() > 0) {
                    performAttack(attacker);
                }
            }

            if (checkWin(player1Team)) {
                System.out.println("Player 1 Wins!");
                break;
            } 
            else if (checkWin(player2Team)) {
                System.out.println("Player 2 Wins!");
                break;
            }

            restoreArmies(player1Team);
            restoreArmies(player2Team);
        }

        System.out.println("The battle is a draw.");
    }

    // Method to get the sorted list of armies for the turn based on speed and attack priority
    private List<Army> getSortedArmies() {
        List<Army> sortedArmies = new ArrayList<>(player1Team);
        sortedArmies.addAll(player2Team);
        sortedArmies.sort(Comparator.comparingInt(Army::getSpeed).reversed().thenComparing(this::getAttackPriority).reversed());
        return sortedArmies;
    }

    // Method to get the attack priority of an army
    private int getAttackPriority(Army a) {
        if (a instanceof Healers) return 0;
        if (a instanceof Mages) return 1;
        if (a instanceof MythicalCreatures) return 2;
        if (a instanceof Knights) return 3;
        return 4; // Archer
    }

    // Method to perform the attack for a given attacker
    private void performAttack(Army attacker) {
        Army target = getTarget(attacker);
        if (attacker instanceof Healers) {
            healLowestHealth(attacker, getOwnTeam(attacker));
        } 
        else {
            reduceHealth(attacker, target);
        }
    }
    private Army getTarget(Army attacker) {
        List<Army> opponentTeam = getOpponentTeam(attacker);

        if (!opponentTeam.isEmpty()) {
            Army target = opponentTeam.get(0);
            for (Army potentialTarget : opponentTeam) {
                if (potentialTarget.getDefence() < target.getDefence()) {
                    target = potentialTarget;
                }
            }
            return target;
        }
        return null;
    }

    // Method to reduce the health of the target based on the attacker's attack
    private void reduceHealth(Army attacker, Army target) {
        if (target != null) {
            double damage = 0.5 * attacker.getAttack() - 0.1 * target.getDefence();
            target.setHealth((int)(target.getHealth() - damage));
            System.out.println(attacker.getName() + " attacks " + target.getName() + " for " + damage + " damage.");
            if (target.getHealth() <= 0) {
                System.out.println(target.getName() + " has been defeated!");
            }
        }
    }

    // Method to heal the lowest health character in the team for a healer
    private void healLowestHealth(Army healer, List<Army> team) {
        Army target = findLowestHealth(team);

        if (target != null) {
            int healingAmount = (int) (0.1 * healer.getAttack());
            target.setHealth(target.getHealth() + healingAmount);

            System.out.println(healer.getName() + " heals " + target.getName() + " for " + healingAmount + " health.");
        }
    }

    private Army findLowestHealth(List<Army> team) {
        Army lowestHealth = null;

        for (Army member : team) {
            if (lowestHealth == null || member.getHealth() < lowestHealth.getHealth()) {
                lowestHealth = member;
            }
        }

        return lowestHealth;
    }


    // Method to check if a team has won by defeating all characters
    private boolean checkWin(List<Army> team) {
        for (Army army : team) {
            if (army.getHealth() > 0) {
                return false; // At least one army is still alive
            }
        }
        return true; // All armies have 0 or less health
    }


    // Method to restore the health of all characters in a team to the initial state
    private void restoreArmies(List<Army> team) {
    	for(Army a : team) {
    		a.storeOriginalValue();
    	}
    }

    // Method to get the own team of a given army
    private List<Army> getOwnTeam(Army army) {
        SellingBuying armylist = new SellingBuying();
        return armylist.getArmyList();
    }

    // Method to get the opponent team of a given army
 // Method to get the opponent team of a given army
    private List<Army> getOpponentTeam(Army army) {
        Opponent opponent = new Opponent();
        Opponent selectedOpponent = opponent.selectRandomOpponent();
        return selectedOpponent.getArmyList();
    }

}