package chainOfResponsibilities.present;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.present.Deuxiemegrp;
import groupes.present.Verbe;


public class Parse2G extends ParseurVerbeCOR{

	public Parse2G(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new Deuxiemegrp(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
