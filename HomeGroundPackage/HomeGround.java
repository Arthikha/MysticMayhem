package HomeGroundPackage;

import java.util.ArrayList;

import ArmyPackage.*;

public class HomeGround {

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

    public ArrayList<Army> highLanders = new ArrayList<Army>();
    public ArrayList<Army> marshLanders = new ArrayList<Army>();
    public ArrayList<Army> sunChildren = new ArrayList<Army>();
    public ArrayList<Army> mystics = new ArrayList<Army>();

    // Constructor to initialize arrays
    public HomeGround() {
        highLanders.add(shooter);
        highLanders.add(ranger);
        highLanders.add(cavalier);
        highLanders.add(zoro);
        highLanders.add(enchanter);
        highLanders.add(conjurer);
        highLanders.add(medic);

        marshLanders.add(squire);
        marshLanders.add(swiftblade);
        marshLanders.add(warlock);
        marshLanders.add(alchemist);
        marshLanders.add(basilisk);
        marshLanders.add(hydra);

        sunChildren.add(sunfire);
        sunChildren.add(zing);
        sunChildren.add(templer);
        sunChildren.add(soother);
        sunChildren.add(lightbringer);
        sunChildren.add(dragon);
        sunChildren.add(phoenix);

        mystics.add(saggitarius);
        mystics.add(illusionist);
        mystics.add(eldritch);
        mystics.add(saint);
        mystics.add(pegasus);
    }

    public void HillCrest() {
        for (Army a : highLanders) {
            a.setAttack(1);
            a.setDefence(1);
        }
        for (Army a : marshLanders) {
            a.setSpeed(-1);
        }
        for (Army a : sunChildren) {
            a.setSpeed(-1);
        }
    }

    public void Marshland() {
        for (Army a : marshLanders) {
            a.setDefence(2);
        }
        for (Army a : sunChildren) {
            a.setAttack(-1);
        }
        for (Army a : mystics) {
            a.setSpeed(-1);
        }
    }

    public void Desert() {
        for (Army a : marshLanders) {
            a.setHealth(-1);
        }
        for (Army a : sunChildren) {
            a.setAttack(1);
        }
    }

    public void Arcane() {
        for (Army a : highLanders) {
            a.setSpeed(-1);
            a.setDefence(-1);
        }
        for (Army a : marshLanders) {
            a.setSpeed(-1);
            a.setDefence(-1);
        }
        for (Army a : mystics) {
            a.setAttack(2);
        }
    }
}
