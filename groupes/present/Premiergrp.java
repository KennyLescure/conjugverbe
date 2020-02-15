package groupes.present;

public class Premiergrp extends Verbe{

	public Premiergrp(String infinitif) {
		super(infinitif, "er");
	}
	
	public String terminaison1()
	{		
		return "e";
	}
	
	public String terminaison2()
	{		
		return "es";
	}
	
	public String terminaison3()
	{		
		return "e";
	}
	
	public String terminaison4()
	{
		if (radical.endsWith("g")) return "eons";
		return "ons";
	}
	
	public String terminaison5()
	{
		return "ez";
	}
	
	public String terminaison6()
	{
		return "ent";
	}

	
}
