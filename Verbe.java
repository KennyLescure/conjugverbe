
public abstract class Verbe {

	String radical; //exemple : chanter > chant
	public abstract String terminaison1erS();
	public abstract String terminaison1erP();
	public abstract String terminaisonPPasse();
	
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


	public String conjugue1erepersonnesingulier()
	{	
		return this.pronomJe()+radical+terminaison1erS();
	}
	
	protected String pronomJe() {
		String voyelle = "aeiouy";
		if (voyelle.indexOf(radical.substring(0, 1)) != 0 )
		{
		return "je ";
		}
		else
		{
		return "j'";
		}
	}
	
	
	public  String conjugue1erepersonnepluriel() 
	{
		return "nous "+radical+terminaison1erP();
	}
	
	public  String conjugueparticipepresent()
	{
		return "en "+radical+terminaison1erP().replace("ons", "ant");
	}
	
	public  String conjugueparticipepasse()
	{
		return radical+terminaisonPPasse();
	}
	
}
