package PlayerProfile;

import java.util.ArrayList;
import java.util.Scanner;
import ArmyPackage.*;
import EquipmentPackage.*;
//import HomeGroundPackage.Land;

public class SellingBuying {
	// Maps category (e.g., "Archer") to character
	public int total_coins = 500;;
	ArrayList<Army> armyList = new ArrayList<>();

	// Method to buy a new character
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

	String equipmentList[] = new String[2];

	// Method to buy a new character
	Chainmail chainmail = new Chainmail();
	Regalia regalia = new Regalia();
	Fleece fleece = new Fleece();
	Excalibur excalibur = new Excalibur();
	Amulet amulet = new Amulet();
	Crystal crystal = new Crystal();

	Scanner scan = new Scanner(System.in);

	public void buyCharacter() {

		System.out.println("Do you want buy characters? (1.yes/2.no) ");
		int buy = scan.nextInt();
		
		
		Outerloop: while (buy == 1) {
			System.out.println("Select characters : ");
			String characters[] = { "archers", "knights", "mages", "healers", "mythical creatures" };
			for (String character : characters) {
				System.out.println(character);
				switch (character) {
					case "archers":
						System.out.println(shooter.toString());
						System.out.println(ranger.toString());
						System.out.println(sunfire.toString());
						System.out.println(zing.toString());
						System.out.println(saggitarius.toString());
						System.out.println("select Archer: (1.Shooter,2.Ranger,3.Sunfire,4.Zing,5.Saggitarius)");
						int archer = scan.nextInt();
						switch (archer) {
							case 1:
								if (total_coins >= shooter.getPrice()) {
									armyList.add(shooter);
									total_coins -= shooter.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy shooter.");
									break Outerloop;
								}
								break;
							case 2:
								if (total_coins >= ranger.getPrice()) {
									armyList.add(ranger);
									total_coins -= ranger.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy ranger.");
									break Outerloop;
								}
								break;
							case 3:
								if (total_coins >= sunfire.getPrice()) {
									armyList.add(sunfire);
									total_coins -= sunfire.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy sunfire.");
									break Outerloop;
								}
								break;
							case 4:
								if (total_coins >= zing.getPrice()) {
									armyList.add(zing);
									total_coins -= zing.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy zing.");
									break Outerloop;
								}
								break;
							case 5:
								if (total_coins >= saggitarius.getPrice()) {
									armyList.add(saggitarius);
									total_coins -= saggitarius.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy saggitarius.");
									break Outerloop;
								}
								System.out.println("");
						}
						break;
					case "knights":

						System.out.println(squire.toString());
						System.out.println(cavalier.toString());
						System.out.println(templer.toString());
						System.out.println(zoro.toString());
						System.out.println(swiftblade.toString());
						System.out.println("Select Knights: (1.Squire,2.Cavalier,3.Templar,4.Zoro,5.Swiftblade)");
						int knights = scan.nextInt();
						
						switch (knights) {
							case 1:
								if (total_coins >= squire.getPrice()) {
									armyList.add(squire);
									total_coins -= squire.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy squire.");
									break Outerloop;
								}
								break;
							case 2:
								if (total_coins >= cavalier.getPrice()) {
									armyList.add(cavalier);
									total_coins -= cavalier.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy cavalier.");
									break Outerloop;
								}
								break;
							case 3:
								if (total_coins >= templer.getPrice()) {
									armyList.add(templer);
									total_coins -= templer.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy templar.");
									break Outerloop;
								}
								break;
							case 4:
								if (total_coins >= zoro.getPrice()) {
									armyList.add(zoro);
									total_coins -= zoro.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy zoro.");
									break Outerloop;
								}
								break;
							case 5:
								if (total_coins >= swiftblade.getPrice()) {
									armyList.add(swiftblade);
									total_coins -= swiftblade.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy swiftblade.");
									break Outerloop;
								}

						}
						break;
					case "mages":

						System.out.println(warlock.toString());
						System.out.println(illusionist.toString());
						System.out.println(enchanter.toString());
						System.out.println(conjurer.toString());
						System.out.println(eldritch.toString());
						System.out.println("select Mages: (1.Warlock,2.Illusionist,3.Enchanter,4.Conjurer,5.Eldritch)");
						int mages = scan.nextInt();
					
						switch (mages) {
							case 1:
								if (total_coins >= warlock.getPrice()) {
									armyList.add(warlock);
									total_coins -= warlock.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy warlock.");
									break Outerloop;
								}
								break;
							case 2:
								if (total_coins >= illusionist.getPrice()) {
									armyList.add(illusionist);
									total_coins -= illusionist.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy illusionist.");
									break Outerloop;
								}
								break;
							case 3:
								if (total_coins >= enchanter.getPrice()) {
									armyList.add(enchanter);
									total_coins -= enchanter.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy enchanter.");
									break Outerloop;
								}
								break;
							case 4:
								if (total_coins >= conjurer.getPrice()) {
									armyList.add(conjurer);
									total_coins -= conjurer.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy conjurer.");
									break Outerloop;
								}
								break;
							case 5:
								if (total_coins >= eldritch.getPrice()) {
									armyList.add(eldritch);
									total_coins -= eldritch.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy eldritch.");
									break Outerloop;
								}
						}
						break;
					case "healers":

						System.out.println(soother.toString());
						System.out.println(medic.toString());
						System.out.println(alchemist.toString());
						System.out.println(saint.toString());
						System.out.println(lightbringer.toString());
						System.out.println("select Healers: (1.Soother,2.Medic, 3.Alchemist,4.Saint,5.Lightbringer)");
						int healers = scan.nextInt();
						
						switch (healers) {
							case 1:
								if (total_coins >= soother.getPrice()) {
									armyList.add(soother);
									total_coins -= soother.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy soother.");
									break Outerloop;
								}
								break;
							case 2:
								if (total_coins >= medic.getPrice()) {
									armyList.add(medic);
									total_coins -= medic.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy medic.");
									break Outerloop;
								}
								break;
							case 3:
								if (total_coins >= alchemist.getPrice()) {
									armyList.add(alchemist);
									total_coins -= alchemist.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy alchemist.");
									break Outerloop;
								}
								break;
							case 4:
								if (total_coins >= saint.getPrice()) {
									armyList.add(saint);
									total_coins -= saint.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy saint.");
									break Outerloop;
								}
								break;
							case 5:
								if (total_coins >= lightbringer.getPrice()) {
									armyList.add(lightbringer);
									total_coins -= lightbringer.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy lightbringer.");
									break Outerloop;
								}
						}
						break;
					case "mythical creatures":

						System.out.println(dragon.toString());
						System.out.println(basilisk.toString());
						System.out.println(hydra.toString());
						System.out.println(phoenix.toString());
						System.out.println(pegasus.toString());
						System.out.println("select Mythical creatures: (1.Dragon,2.Basilisk,3. Hydra,4.Phoenix, 5.Pegasus)");
						int mythicalCreatures = scan.nextInt();
						
						switch (mythicalCreatures) {
							case 1:
								if (total_coins >= dragon.getPrice()) {
									armyList.add(dragon);
									total_coins -= dragon.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy dragon.");
									break Outerloop;
								}
								break;
							case 2:
								if (total_coins >= basilisk.getPrice()) {
									armyList.add(basilisk);
									total_coins -= basilisk.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy basilisk.");
									break Outerloop;
								}
								break;
							case 3:
								if (total_coins >= hydra.getPrice()) {
									armyList.add(hydra);
									total_coins -= hydra.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy hydra.");
									break Outerloop;
								}
								break;
							case 4:
								if (total_coins >= phoenix.getPrice()) {
									armyList.add(phoenix);
									total_coins -= phoenix.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy phoneix.");
									break Outerloop;
								}
								break;
							case 5:
								if (total_coins >= pegasus.getPrice()) {
									armyList.add(pegasus);
									total_coins -= pegasus.getPrice();
								} else {
									System.out.println("Sorry! You have not enough coins to buy pegasus.");
									break Outerloop;
								}
						}
				}
			}
			System.out.println(" Do you want buy characters again ? (1. yes  2. no) ");
			buy = scan.nextInt();
		}
	}

	public void buyEquipment() {
		System.out.println(" Do you want buy Equipment? (1.yes/2.no) ");
		int buyEquipment = scan.nextInt();

		Outerloop: while (buyEquipment == 1) {
			System.out.println(" Select Equipment : (1.Armour,2.Artefacts) ");
			int equipment = scan.nextInt();

			switch (equipment) {
				case 1:
					System.out.println(chainmail.toString());
					System.out.println(regalia.toString());
					System.out.println(fleece.toString());
					System.out.println("Select Armour: (1.Chainmail,2.Regalia,3.Fleece )");
					int armour = scan.nextInt();
					
					switch (armour) {
						case 1:
							if (total_coins >= chainmail.getPrice()) {
								equipmentList[0] = "chainmail";
								total_coins -= chainmail.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy chainmail.");
								break Outerloop;
							}
							break;
						case 2:
							if (total_coins >= regalia.getPrice()) {
								equipmentList[0] = "regalia";
								total_coins -= regalia.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy regalia.");
								break Outerloop;
							}
							break;
						case 3:
							if (total_coins >= fleece.getPrice()) {
								equipmentList[0] = "fleece";
								total_coins -= fleece.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy fleece.");
								break Outerloop;
							}
							break;
					}
				case 2:

					System.out.println(excalibur.toString());
					System.out.println(amulet.toString());
					System.out.println(crystal.toString());
					System.out.println("Select Artefact: (1.Excalibur,2.Amulet,3.Crystal )");

					int artefacts = scan.nextInt();
					
					switch (artefacts) {
						case 1:
							if (total_coins >= excalibur.getPrice()) {
								equipmentList[1] = "excalibur";
								total_coins -= excalibur.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy excalibur.");
								break Outerloop;
							}
							break;
						case 2:
							if (total_coins >= amulet.getPrice()) {
								equipmentList[1] = "amulet";
								total_coins -= amulet.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy amulet.");
								break Outerloop;
							}
							break;
						case 3:
							if (total_coins >= crystal.getPrice()) {
								equipmentList[1] = "crystal";
								total_coins -= crystal.getPrice();
							} else {
								System.out.println("Sorry! You have not enough coins to buy crystal.");
								break Outerloop;
							}
							break;

					}

					System.out.println(" Do you want change the Equipment? (1. yes  2. no) ");
					buyEquipment = scan.nextInt();
			}
		}
	}

	public double WithEquip() {
		double price = 0;
		for (String equip : equipmentList) {
			switch (equip) {
				case "chainmail":
					price = 20 / 100 * chainmail.getPrice();
					equipmentList[0] = null;
					break;
				case "regalia":
					price = 20 / 100 * regalia.getPrice();
					equipmentList[0] = null;
					break;
				case "fleece":
					price = 20 / 100 * fleece.getPrice();
					equipmentList[0] = null;
					break;
				case "excalibur":
					price = 20 / 100 * excalibur.getPrice();
					equipmentList[1] = null;
					break;
				case "amulet":
					price = 20 / 100 * amulet.getPrice();
					equipmentList[1] = null;
					break;
				case "crystal":
					price = 20 / 100 * crystal.getPrice();
					equipmentList[1] = null;
					break;
			}
		}
		return price;
	}

	public void sellCharacter() {

		System.out.println("Do you want to sell characters?(1.yes/2.no)");
		int sell = scan.nextInt();
		
		System.out.println("Do you want to sell with equipment?(1.yes/2.no)");
		int sellWithEquip = scan.nextInt();

		while (sell == 1) {
			System.out.println("Select selling character : 1.shooter,2.ranger,3.sunfire,4.zing,5.saggitarius,6.squire,7.cavalier,8.templar,9.zoro,10.swiftblade,11.warlock,12.illusionist,13.enchanter,14.conjurier,15.eldritch,16.soother,17.medic,18.alchemist,19.saint,20.lightbringer,21.dragon,22.basilisk,23.hydra,24.phoenix,25.pegasus");
			System.out.println("\n");
			for (Army army : armyList) {
				System.out.print(army.toString() + " ");
			}
			System.out.println("\n");
			System.out.println("Select number according to above: ");
			int sellingCharacter = scan.nextInt();
			
			switch (sellingCharacter) {
				case 1:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (shooter.getPrice() + price) * 90 / 100;
						armyList.remove(shooter);
						break;
					} else {
						total_coins += shooter.getPrice() * 90 / 100;
						armyList.remove(shooter);
						break;
					}

				case 2:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (ranger.getPrice() + price) * 90 / 100;
						armyList.remove(ranger);
						break;
					} else {
						total_coins += ranger.getPrice() * 90 / 100;
						armyList.remove(ranger);
						break;
					}
				case 3:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (sunfire.getPrice() + price) * 90 / 100;
						armyList.remove(sunfire);
						break;
					} else {
						total_coins += sunfire.getPrice() * 90 / 100;
						armyList.remove(sunfire);
						break;
					}
				case 4:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (zing.getPrice() + price) * 90 / 100;
						armyList.remove(zing);
						break;
					} else {
						total_coins += zing.getPrice() * 90 / 100;
						armyList.remove(zing);
						break;
					}
				case 5:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (saggitarius.getPrice() + price) * 90 / 100;
						armyList.remove(saggitarius);
						break;
					} else {
						total_coins += saggitarius.getPrice() * 90 / 100;
						armyList.remove(saggitarius);
						break;
					}
				case 6:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (squire.getPrice() + price) * 90 / 100;
						armyList.remove(squire);
						break;
					} else {
						total_coins += squire.getPrice() * 90 / 100;
						armyList.remove(squire);
						break;
					}
				case 7:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (cavalier.getPrice() + price) * 90 / 100;
						armyList.remove(cavalier);
						break;
					} else {
						total_coins += cavalier.getPrice() * 90 / 100;
						armyList.remove(cavalier);
						break;
					}
				case 8:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (templer.getPrice() + price) * 90 / 100;
						armyList.remove(templer);
						break;
					} else {
						total_coins += templer.getPrice() * 90 / 100;
						armyList.remove(templer);
						break;
					}
				case 9:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (zoro.getPrice() + price) * 90 / 100;
						armyList.remove(zoro);
						break;
					} else {
						total_coins += zoro.getPrice() * 90 / 100;
						armyList.remove(zoro);
						break;
					}
				case 10:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (swiftblade.getPrice() + price) * 90 / 100;
						armyList.remove(swiftblade);
						break;
					} else {
						total_coins += swiftblade.getPrice() * 90 / 100;
						armyList.remove(swiftblade);
						break;
					}
				case 11:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (warlock.getPrice() + price) * 90 / 100;
						armyList.remove(warlock);
						break;
					} else {
						total_coins += warlock.getPrice() * 90 / 100;
						armyList.remove(warlock);
						break;
					}
				case 12:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (illusionist.getPrice() + price) * 90 / 100;
						armyList.remove(illusionist);
						break;
					} else {
						total_coins += illusionist.getPrice() * 90 / 100;
						armyList.remove(illusionist);
						break;
					}
				case 13:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (enchanter.getPrice() + price) * 90 / 100;
						armyList.remove(enchanter);
						break;
					} else {
						total_coins += enchanter.getPrice() * 90 / 100;
						armyList.remove(enchanter);
						break;
					}
				case 14:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (conjurer.getPrice() + price) * 90 / 100;
						armyList.remove(conjurer);
						break;
					} else {
						total_coins += conjurer.getPrice() * 90 / 100;
						armyList.remove(conjurer);
						break;
					}
				
				case 15:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (eldritch.getPrice() + price) * 90 / 100;
						armyList.remove(eldritch);
						break;
					} else {
						total_coins += eldritch.getPrice() * 90 / 100;
						armyList.remove(eldritch);
						break;
					}
				
				case 16:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (soother.getPrice() + price) * 90 / 100;
						armyList.remove(soother);
						break;
					} else {
						total_coins += soother.getPrice() * 90 / 100;
						armyList.remove(soother);
						break;
					}

				case 17:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (medic.getPrice() + price) * 90 / 100;
						armyList.remove(medic);
						break;
					} else {
						total_coins += medic.getPrice() * 90 / 100;
						armyList.remove(medic);
						break;
					}

				case 18:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (alchemist.getPrice() + price) * 90 / 100;
						armyList.remove(alchemist);
						break;
					} else {
						total_coins += alchemist.getPrice() * 90 / 100;
						armyList.remove(alchemist);
						break;
					}

				case 19:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (saint.getPrice() + price) * 90 / 100;
						armyList.remove(saint);
						break;
					} else {
						total_coins += saint.getPrice() * 90 / 100;
						armyList.remove(saint);
						break;
					}

				case 20:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (lightbringer.getPrice() + price) * 90 / 100;
						armyList.remove(lightbringer);
						break;
					} else {
						total_coins += lightbringer.getPrice() * 90 / 100;
						armyList.remove(lightbringer);
						break;
					}

				case 21:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (dragon.getPrice() + price) * 90 / 100;
						armyList.remove(dragon);
						break;
					} else {
						total_coins += dragon.getPrice() * 90 / 100;
						armyList.remove(dragon);
						break;
					}
				case 22:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (basilisk.getPrice() + price) * 90 / 100;
						armyList.remove(basilisk);
						break;
					} else {
						total_coins += basilisk.getPrice() * 90 / 100;
						armyList.remove(basilisk);
						break;
					}
				case 23:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (hydra.getPrice() + price) * 90 / 100;
						armyList.remove(hydra);
						break;
					} else {
						total_coins += hydra.getPrice() * 90 / 100;
						armyList.remove(hydra);
						break;
					}
				case 24:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (phoenix.getPrice() + price) * 90 / 100;
						armyList.remove(phoenix);
						break;
					} else {
						total_coins += phoenix.getPrice() * 90 / 100;
						armyList.remove(phoenix);
						break;
					}
				case 25:
					if (sellWithEquip == 1 && equipmentList.length != 0) {
						double price = WithEquip();
						total_coins += (pegasus.getPrice() + price) * 90 / 100;
						armyList.remove(pegasus);
						break;
					} else {
						total_coins += pegasus.getPrice() * 90 / 100;
						armyList.remove(pegasus);
						break;
					}

			}

			System.out.println("Do you want continue selling");
			sell = scan.nextInt();
		}

	}

	public void displayArmyList() {
		if (!armyList.isEmpty()) {
			// Display each army character line by line
			for (Army army : armyList) {
				System.out.println(army);
			}
		}
	}

	public void displayEquipmentList() {
		if (equipmentList.length != 0) {
			System.out.println("Equipment :");
			for (String equipment : equipmentList) {
				System.out.println(equipment);
			}
		}
	}

	public ArrayList<Army> getArmyList() {
		return armyList;
	}
}