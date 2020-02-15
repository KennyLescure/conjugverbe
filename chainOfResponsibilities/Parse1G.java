package chainOfResponsibilities;

import groupes.*;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class Parse1G extends ParseurVerbeCOR{

	public Parse1G(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new Premiergrp(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
