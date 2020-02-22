package chainOfResponsibilities.present;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.present.Verbe;
import groupes.present.VerbeEnOire;
import groupes.present.VerbeEnOudre;


public class ParseOIRE extends ParseurVerbeCOR{

	public ParseOIRE(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnOire(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
