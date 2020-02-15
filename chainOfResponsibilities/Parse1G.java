package chainOfResponsibilities;

import groupes.*;


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
