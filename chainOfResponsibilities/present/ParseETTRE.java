package chainOfResponsibilities.present;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.present.Verbe;
import groupes.present.VerbeEnEttre;


public class ParseETTRE extends ParseurVerbeCOR{

	public ParseETTRE(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnEttre(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
