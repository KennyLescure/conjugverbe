package groupes;

public class Deuxiemegrp extends Verbe {

	public Deuxiemegrp(String infinitif) 
	{
		super(infinitif, "ir");
	}
	
	public String terminaison1erS()
	{		
		return "is";
	}
	
	public String terminaison1erP()
	{		
		return "issons";
	}
	
	public String terminaisonPPasse()
	{		
		return "i";
	}
	
}
