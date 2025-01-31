package PlayerProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import ArmyPackage.*;
import EquipmentPackage.*;



public class Opponent implements PlayerProfile{
     
    private String opponentUsername;
    private String name;
    private int XP;
    private int goldCoins;
    private String homeGround;
    private List<Army> armyList;
    private Equipment[] equipmentList;
    private static int opponentUserID = 0;

    Shooter shooter = new Shooter();
    Ranger ranger = new Ranger();
    Sunfire sunfire = new Sunfire();
    Zing zing = new Zing();
    Saggitarius saggitarius = new Saggitarius();
    Squire squire = new Squire();
    Cavalier cavalier = new Cavalier();
    Templar templer = new Templar();
    Zoro zoro = new Zoro();
    Swiftblade swiftblade = new Swiftblade();
    Warlock warlock = new Warlock();
    Illusionist illusionist = new Illusionist();
    Enchanter enchanter = new Enchanter();
    Conjurer conjurer = new Conjurer();
    Eldritch eldritch = new Eldritch();
    Soother soother = new Soother();
    Medic medic = new Medic();
    Alchemist alchemist = new Alchemist();
    Saint saint = new Saint();
    Lightbringer lightbringer = new Lightbringer();
    Dragon dragon = new Dragon();
    Basilisk basilisk = new Basilisk();
    Hydra hydra = new Hydra();
    Phoenix phoenix = new Phoenix();
    Pegasus pegasus = new Pegasus();
    Amulet amulet = new Amulet();
    Chainmail chainmail = new Chainmail();
    Excalibur excalibur = new Excalibur();
    Crystal crystal = new Crystal();
    Fleece fleece = new Fleece();
    Regalia regalia = new Regalia();


    public static Map<String, Opponent> opponentUsernames = new HashMap<>(); 
    // Map to store opponentnames and corresponding objects
    
    public Opponent(String opponentUsername, String name, int XP, int goldCoins, String homeGround, List<Army> armyList, Equipment[] equipmentList) {
        this.opponentUsername = opponentUsername;
        this.name = name;
        this.XP = XP;
        this.goldCoins = goldCoins;
        this.homeGround = homeGround;
        this.armyList = armyList;
        this.equipmentList = equipmentList;
        ++opponentUserID;
    }

    public Opponent(){
        opponentUsernames.put("whitewolf", new Opponent("whitewolf", "GeraltofRivia", 32, 215, "Marshland", new ArrayList<>(List.of(ranger, squire, warlock, medic, dragon)), new Equipment[]{chainmail, amulet}));
        opponentUsernames.put("darkreaper", new Opponent("darkreaper", "AlistairBlackwood", 40, 300, "Hillcrest", new ArrayList<>(List.of(sunfire, zoro, illusionist, soother, hydra)), new Equipment[]{regalia, excalibur}));
        opponentUsernames.put("shadowstrike", new Opponent("shadowstrike", "LyraSilverblade", 56, 130, "Marshland", new ArrayList<>(List.of(zing, cavalier, conjurer, saint, phoenix)), new Equipment[]{fleece, amulet}));
        opponentUsernames.put("phoenixrising", new Opponent("phoenixrising", "DanteBloodmoon", 16, 200, "Desert", new ArrayList<>(List.of(saggitarius, squire, eldritch, soother, pegasus)), new Equipment[]{chainmail, crystal}));
        opponentUsernames.put("voidwalker", new Opponent("voidwalker", "ViktorIronheart", 22, 340, "Arcane", new ArrayList<>(List.of(zing, swiftblade, enchanter, alchemist, basilisk)), new Equipment[]{regalia, amulet}));
    }
 
    public String getUsername() {
        return opponentUsername;
    }

    public void addOponent(Opponent opp, String username){
        opponentUsernames.put(username, opp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    public void setArmyList(List<Army> armyList) {
        this.armyList = armyList;
    }

    public List<Army> getArmyList() {
        return armyList;
    }

    public void setEquipmentList(Equipment [] equipmentList){
        this.equipmentList = equipmentList;
    }

    public Equipment [] getEquipmentList() {
        return equipmentList;
    }


    public void displayPlayerInfo() {
        System.out.println("Username: " + opponentUsername);
        System.out.println("XP: " + XP);
    }
    
    
    private static int skipCount = 0;

    // Method to randomly select an opponent
    public Opponent selectRandomOpponent() {
        List<Opponent> opponents = new ArrayList<>(opponentUsernames.values());
        if(skipCount>=6){
            return opponents.get(0);
        }
        
        Random random = new Random();
        int randomIndex = random.nextInt(opponents.size());
        
        Opponent selectedOpponent = opponents.get(randomIndex);

        // Display opponent information
        System.out.println("Opponent Details: ");
        selectedOpponent.displayPlayerInfo();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to accept this opponent? (1.yes/2.skip): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return selectedOpponent;
        } 
        else if (choice == 2) {
            ++skipCount;
            if (skipCount <= 5) {
                System.out.println("Opponent skipped. Moving to the next opponent.");
                return selectRandomOpponent();
            } 
            skipCount = 0;
            return opponents.get(0); // Return the whitewolf
        }
        return opponents.get(0);
    }
    
}