package chainOfResponsibilities;

import groupes.*;
import groupes.present.Verbe;
import groupes.present.VerbeEnNdre;


public class ParseNDRE extends ParseurVerbeCOR{

	public ParseNDRE(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnNdre(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
