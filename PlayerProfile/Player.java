package PlayerProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ArmyPackage.Army;
import HomeGroundPackage.HomeGround;


public class Player implements PlayerProfile{
            Scanner scan = new Scanner(System.in);

            private String username;
            private String name;
            private int XP;
            private int goldCoins;
            private String homeGround;
            private static int userID = 0; // Unique userID
        
            private static Map<String, String> usernames = new HashMap<>(); // Map to store usernames and corresponding userIDs
        
            SellingBuying  buySellPlayer = new SellingBuying ();
        
            public Player(String username, String name, int XP, int goldCoins, String homeGround) {
                this.username = username;
                this.name = name;
                this.XP = XP;
                this.goldCoins = goldCoins;
                this.homeGround = homeGround;
                ++userID;
                usernames.put(username, String.valueOf(userID)); // Add username and userID to hashmap (Key is username)
            }
            
            public Player() {}
            
            @Override
            public String getUsername() {
                return username;
            }
        
            
            public void setUsername(String username) {
                // Check if the new username already exists
                Opponent opp = new Opponent();
                if (usernames.containsKey(username) || opp.opponentUsernames.containsKey(username)) { //Call opponentUsernames from opponent class
                    System.out.println("Username already exists. Please enter a new one.");
                    return;
                }
                
                // Update username and its corresponding userID
                this.username = username;
                usernames.put(username, String.valueOf(userID));
            }
        
            @Override
            public String getName() {
                return name;
            }
        
            @Override
            public void setName(String name) {   
                this.name = name;
            }
        
            @Override
            public int getXP() {
                return XP;
            }
        
            @Override
            public void setXP(int XP) {
                this.XP = XP;
            }
        
            @Override
            public int getGoldCoins() {
                return goldCoins;
            }
        
            @Override
            public void setGoldCoins(int goldCoins) {
                this.goldCoins = goldCoins;
            }
        
            @Override
            public String getHomeGround() {
                return homeGround;
            }
        
            @Override
            public void setHomeGround(String homeGround) {
                this.homeGround = homeGround;
            }
        
            public void displayPlayerInfo() {
                System.out.println("Username: " + username);
                System.out.println("Name: " + name);
                System.out.println("XP: " + XP);
                System.out.println("Gold coins: " + goldCoins);
                System.out.println("Selected Homeground: " + homeGround);

                buySellPlayer.displayArmyList();
                buySellPlayer.displayEquipmentList();
            }
            public ArrayList<Army> army = buySellPlayer.getArmyList();
            public void buySellCharacter(){ 
                buySellPlayer.buyCharacter();
                buySellPlayer.buyEquipment();
                buySellPlayer.sellCharacter();
            }
        
        
            public void challengeOpponent() {  
                Opponent opp = new Opponent();
                opp.selectRandomOpponent();
            }
            
            public void selectHomeground() {
                HomeGround ground = new HomeGround(); 
                System.out.println("Choose a Home ground : \n 1. Hillcrest  2. Marshland  3. Desert  4. Arcane");

                int choice;

                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    System.out.println("Enter your homeground (1-4):");
                    String input = reader.readLine().trim();

                    if (input.matches("^[1-4]$")) {
                        choice = Integer.parseInt(input);
                    } 
                    else {
                        throw new IllegalArgumentException("Invalid input. Please choose a number between 1 and 4.");
                    }

                    switch (choice) {
                        case 1:
                            ground.HillCrest();
                            setHomeGround("Hillcrest");
                            break;
                        case 2:
                            ground.Marshland();
                            setHomeGround("Marshland");
                            break;
                        case 3:
                            ground.Desert();
                            setHomeGround("Desert");
                            break;
                        case 4:
                            ground.Arcane();
                            setHomeGround("Arcane");
                            break;
                        default:
                            System.out.println("Unexpected error. Please try again.");
                    }

                } 
                catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error reading input. Please try again.");
                } 
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
        }
}

