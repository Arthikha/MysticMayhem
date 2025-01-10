import PlayerProfile.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number (1.New game 2.Exit)");
        int choice = scanner.nextInt();
        while (choice == 1) {

            // Creating user 1 profile
            System.out.println("Enter details for User 1:");
            System.out.println("Username: ");
            String username = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            int XP = 1;
            System.out.println("XP: " + XP);
            
            Player user1 = new Player(username, name, XP, 500, "None");
            
            user1.selectHomeground();

            user1.buySellCharacter();
            SellingBuying buyArmy = new SellingBuying();
            
            buyArmy.displayArmyList();

            // Display player information
            System.out.println("\n" + username + "Information:");
            user1.displayPlayerInfo();


            Opponent opp = new Opponent();
            Opponent selectedOpp = opp.selectRandomOpponent();

            if (selectedOpp != null) {
                BattleSystem battle = new BattleSystem(buyArmy.getArmyList(), selectedOpp.getArmyList(), selectedOpp.getHomeGround());
                battle.startBattle();
            }


            buyArmy.sellCharacter();
            System.out.println("Select one(1.New game 2.Exit)");
            choice = scanner.nextInt();
            if (choice == 2) {
                break;
            }
            
        }
    }
}
