package chainOfResponsibilities.passecompose;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class Parse1Gpc extends ParseurVerbeCOR{

	public Parse1Gpc(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new Premiergrppc(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
