package groupes;

public class VerbeEnNdre extends Verbe{

	public VerbeEnNdre(String infinitif) 
	{
		super(infinitif, "ndre");
	}
	
	public String terminaison1erS()
	{
		return "ns";
	}
	
	public String terminaison1erP()
	{
		return "gnons";
	}
	
	public String terminaisonPPasse()
	{
		return "nt";
	}
}
