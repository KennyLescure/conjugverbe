package chainOfResponsibilities.present;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.present.Verbe;
import groupes.present.VerbeEnOudre;


public class ParseOUDRE extends ParseurVerbeCOR{

	public ParseOUDRE(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnOudre(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
