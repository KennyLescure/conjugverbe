package groupes.present;

public abstract class Verbe {

	String radical; //exemple : chanter > chant
	public abstract String terminaison1();
	public abstract String terminaison2();
	public abstract String terminaison3();
	public abstract String terminaison4();
	public abstract String terminaison5();
	public abstract String terminaison6();
	
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
		return this.pronomJe()+radical+terminaison1();
	}
	
	protected String pronomJe() {
		String voyelle = "aeiouy";
		if (voyelle.indexOf(radical.substring(0, 1)) != -1 )
		{
		return "J'";
		}
		else
		{
		return "Je ";
		}
	}
	
	public  String conjugue2() 
	{
		return "Tu "+radical+terminaison2();
	}
	
	public  String conjugue3() 
	{
		return "Il "+radical+terminaison3();
	}
	
	public  String conjugue4() 
	{
		return "Nous "+radical+terminaison4();
	}
	
	public  String conjugue5() 
	{
		return "Vous "+radical+terminaison5();
	}
	
	
	public  String conjugue6() 
	{
		return "Ils "+radical+terminaison6();
	}
	
	//public  String conjugueparticipepresent()
	//{
	//	return "en "+radical+terminaison1erP().replace("ons", "ant");
	//}
	
	//public  String conjugueparticipepasse()
	//{
	//	return radical+terminaisonPPasse();
	//}
	
}
