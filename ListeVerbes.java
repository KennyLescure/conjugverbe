import groupes.Verbe;
public class ListeVerbes {

	Verbe[] verbe;

	public ListeVerbes( groupes.Verbe[] verbe) {
		this.verbe = verbe;
	}

	public String conjugue1erepersonnesingulier() {
		String s;
		int i;
		for(i = 0, s=""; i < verbe.length; i++)
		{
			s += verbe[i].conjugue1erepersonnesingulier()+"\n"; 
		}
		return s;
	}
	
	
	
}
