package groupes;

public class VerbeEnAitre extends Verbe {

	public VerbeEnAitre(String infinitif) 
	{
		super(infinitif, "a�tre");
	}
	
	public String terminaison1erS()
	{
		return "ais";
	}
	
	public String terminaison1erP()
	{
		return "aissons";
	}
	
	public String terminaisonPPasse()
	{
		return "u";
	}
	
}
