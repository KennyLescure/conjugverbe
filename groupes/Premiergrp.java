package groupes;

public class Premiergrp extends Verbe{

	public Premiergrp(String infinitif) 
	{
		super(infinitif, "er");
	}
	
	public String terminaison1erS()
	{		
		return "e";
	}
	
	public String terminaison1erP()
	{
		return "ons";
	}
	
	public String terminaisonPPasse()
	{
		return "é";
	}

	
}
