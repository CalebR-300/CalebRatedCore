package calebR.calebratedcore.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	//This block of code handles wooden board meta entries
	public static enum WoodBoardTypes implements IStringSerializable	{
		

		OAK("Oak",0),
		SPRUCE("Spruce",1),
		BIRCH("Birch",2),
		JUNGLE("Jungle",3),
		ACACIA("Acacia",4),
		DARKOAK("Darkoak",5), 
		TREATED("Treated",6) //Don't forget commas! Last entry doesn't need one, though.
		;
		
		private int ID;
		private String name;

		private WoodBoardTypes(String name,int ID){
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName(){
			return this.name;
		}
		
		public int getID(){
			return ID;
		}
		
		public String toString(){
			return getName();
		}
		
	}
	
	//This block of code handles brick meta entries	
	public static enum BrickTypes implements IStringSerializable	{
		

		STONE("Stone",0),
		ANDESITE("Andesite",1),
		BASALT("Basalt",2),
		DIORITE("Diorite",3),
		DOLOMITE("Dolomite",4),
		GNEISS("Gneiss",5), 
		GRANITE("Granite",6),
		LIMESTONE("Limestone",7),
		MARBLE("Marble",8),
		REDSANDSTONE("Redsandstone",9),
		SANDSTONE("Sandstone",10),
		AMPHIBOLITE("Amphibolite",11),
		ENDSTONE("Endstone",12)
		//Don't forget commas! Last entry doesn't need one, though.
		;
		
		private int ID;
		private String name;

		private BrickTypes(String name,int ID){
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName(){
			return this.name;
		}
		
		public int getID(){
			return ID;
		}
		
		public String toString(){
			return getName();
		}
		
	}
}				