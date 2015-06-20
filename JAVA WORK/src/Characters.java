
public class Characters {
	public int health;
	public int dexterity;
	public int constitution;
	public int strength;
	public int defense;
	public Characters(int choice){
		switch(choice){
		case 1://Rogue
			health = 30;
			dexterity = 20;
			constitution = 40;
			strength = 10;
			defense = 30;
		case 2://Warrior
			health = 40;
			dexterity = 60;
			constitution = 30;
			strength = 20;
			defense = 10;
		case 3://Archer
			health = 20;
			dexterity = 40;
			constitution = 60;
			strength = 30;
			defense = 20;
		}
			
	}
		
		
	public void chooser(int choice){
		
	}

}
