package groupes.passecompose;

public abstract class Verbe {

	String radical; //exemple : chanter > chant
	public abstract String terminaison();
	
	public Verbe(String infinitif, String terminaisonInfinitif)
	{
		int longueurTerminaison = terminaisonInfinitif.length();
		if (infinitif.endsWith(terminaisonInfinitif))
		{
		this.radical = infinitif.substring(0,infinitif.length() - longueurTerminaison);
		}
		else
		{
			throw new IllegalArgumentException("La terminaison du verbe ne correspond pas à son groupe");
		}
	}

	public String conjugue1()
	{	
		return "J'ai"+radical+terminaison();
	}
	
	public  String conjugue2() 
	{
		return "Tu as"+radical+terminaison();
	}
	
	public  String conjugue3() 
	{
		return "Il a"+radical+terminaison();
	}
	
	public  String conjugue4() 
	{
		return "Nous avons"+radical+terminaison();
	}
	
	public  String conjugue5() 
	{
		return "Vous avez"+radical+terminaison();
	}
	
	
	public  String conjugue6() 
	{
		return "Ils ont"+radical+terminaison();
	}
	
	
}
